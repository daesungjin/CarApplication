/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author Samsung
 */
public class Data {
    ArrayList<CarInformation>  cl = new CarList().getList();
    
    File textFile, vinFile;    
    Scanner sc1, sc2;
    String [] property = new String[5];
    public Data() throws FileNotFoundException{
        textFile = new File("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\CarApplication\\src\\main\\resources\\carList.txt");
        vinFile = new File("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\CarApplication\\src\\main\\resources\\vinList.txt");
        if(textFile != null){
        sc1 = new Scanner(textFile);
        }
        if(vinFile != null){
            sc2 = new Scanner(vinFile);
        }
    }
    public ArrayList<CarInformation> readCarInfo(){
        int i = 0;
            while(sc1.hasNextLine()){
                
            property = sc1.nextLine().split(",");
                 
            CarInformation ci = new CarInformation(property[0],Integer.parseInt(property[1]), Integer.parseInt(property[2]), Integer.parseInt(property[3]));
            
            cl.add(ci);
            }
            return cl;
    }
    public ArrayList<CarInformation> addInfoByVin(String vin) throws Exception{
        HashMap<String, String> hm = this.call_me(vin);
        String make = hm.get("make");
        return cl;
    }
    public ArrayList<CarInformation> getCarList(){
         return cl;
     }
     public void addList(CarInformation ci){
         cl.add(ci);
     }
     public void removeList(CarInformation ci){
         cl.remove(ci);
     }
     public ArrayList<CarInformation> sortMileage(){
         ArrayList<CarInformation> list = cl;
         for(int i = list.size()-1; i >= 0; i--) {
        for(int j = 0; j < i; j++) {
            if(list.get(j).getMileage() > list.get(j + 1).getMileage()) {
                CarInformation temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
    }
      return list;
     }
     public ArrayList<CarInformation> sortPrice(){
         ArrayList<CarInformation> list = cl;
         for(int i = list.size()-1; i >= 0; i--) {
        for(int j = 0; j < i; j++) {
            if(list.get(j).getPrice() > list.get(j + 1).getPrice()) {
                CarInformation temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
    }
      return list;
     }
     public void saveCarList() throws IOException{
         String dummy = "";
        for(CarInformation c : cl){
//            if(s.getChecking()){s.setChecking(false);}
           
            dummy += c.toString1()+"\n";
        }
        FileWriter fw = new FileWriter(textFile);
        fw.write(dummy);
        fw.close();
     }
     public HashMap<String, String> call_me(String vin) throws Exception{
        String url = "https://vpic.nhtsa.dot.gov/api/vehicles/decodevinvalues/"+vin+"?format=json";
        HashMap<String,String> info = new HashMap<String, String>();
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int reponseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while((inputLine = in.readLine()) != null){
            response.append(inputLine);
        }
        in.close();
        
        JSONObject myResponse = new JSONObject(response.toString());
        String s = (String) myResponse.get("Results").toString();
        JSONObject myResponse1 = new JSONObject(s.substring(1,s.length()));
        for(String key : myResponse1.keySet()){
            String k = (String)myResponse1.get(key);
            if(!k.isEmpty()) info.put(key, myResponse1.getString(key));
            }
        return info;
    }
}
