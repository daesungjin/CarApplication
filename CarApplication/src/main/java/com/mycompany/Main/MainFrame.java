/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.HashMap;
import org.json.JSONObject;
/**
 *
 * @author Samsung
 */
public class MainFrame extends JFrame{
    Main panel;
     
    
    public MainFrame() throws FileNotFoundException{
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
//      
//      
//      panel = new Main();
//      this.add(panel);
//      this.pack();
//      this.setSize(1000,850);
//      this.setResizable(false);
//      this.setVisible(true);
//      this.setLocationRelativeTo(null);
//      
      
      
    }
    public static void call_me() throws Exception{
        String url = "https://vpic.nhtsa.dot.gov/api/vehicles/decodevinvalues/1HGCD5532VA869266?format=json";
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
        int i = 0;
        for(String key : myResponse1.keySet()){
            String k = (String)myResponse1.get(key);
            if(!k.isEmpty()){
        System.out.println(key+": "+myResponse1.get(key)) ;
        i++;
            }}
        System.out.println(i);
    }
//    public static void main(String[] args) throws FileNotFoundException, Exception
//   {  
//      Data d = new Data();
//     
//      HashMap<String, String> hm = d.call_me("1FTKR1ED9APA75966");      
//       
//     for(String key : hm.keySet())          {
//       System.out.println(key+": "+hm.get(key));}
//       System.out.println(hm.size());
//       
//   }

   
}
