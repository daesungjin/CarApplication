/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Data {
    ArrayList<CarInformation>  cl = new CarList().getList();
    
    File textFile;
    Scanner sc;
    String [] property = new String[5];
    public Data() throws FileNotFoundException{
        textFile = new File("C:\\Users\\Samsung\\Desktop\\hw2\\carList.txt");
        if(textFile != null){
        sc = new Scanner(textFile);
        }
    }
    public ArrayList<CarInformation> readInfo(){
        int i = 0;
            while(sc.hasNextLine()){
                
            property = sc.nextLine().split(",");
                 
            CarInformation ci = new CarInformation(property[0],Integer.parseInt(property[1]), Integer.parseInt(property[2]), Integer.parseInt(property[3]));
            
            cl.add(ci);
            }
            return cl;
    }
     public ArrayList<CarInformation> getCarList(){
         return cl;
     }
     public void addList(CarInformation ci){
         cl.add(ci);
     }
     public ArrayList<CarInformation> sortMileage(){
         ArrayList<CarInformation> list = cl;
         for(int i = list.size()-1; i >= 0; i--) {
        for(int j = 0; j < i; j++) {
            if(list.get(j).geMileage() > list.get(j + 1).geMileage()) {
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
}
