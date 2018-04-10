/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

/**
 *
 * @author Samsung
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SecondFrame extends JFrame
{
   JLabel label;
   Data d;
   JRadioButton small,med,large;
   JTextField space,find,make,model,year,body,engine;
   JLabel line1;
   JButton enter;
   String input;
   
   SecondFrame() throws FileNotFoundException
   {
      //label = new JLabel("0 Cars in stock");
      d = new Data();
      //add(label);
      
      //space = new JTextField(15);
      
      line1 = new JLabel("Search VIN: ");
      add(line1);
      find = new JTextField(20);
      add(find);
      
      
      enter = new JButton("Search");
      add(enter);
      
   
      
      make =new JTextField(20);
      model =new JTextField(20);
      year = new JTextField(20);
      body = new JTextField(20);
      engine = new JTextField(20);
      
      add(make);
     
      add(model);
     
      add(year);
      
      add(body);
     
      add(engine);
      
      
      make.setEditable(false);
      model.setEditable(false);
      year.setEditable(false);
      body.setEditable(false);
      engine.setEditable(false);
      
      
      
      
      
      
            DealerListener1 listener = new DealerListener1();
      enter.addActionListener(listener);
      
     
      
      setLayout(new FlowLayout());
   }
   
   private class DealerListener1 implements ActionListener
   {
   public void actionPerformed(ActionEvent event)
   {
   if(event.getSource() == enter)
   {  
      
     
      HashMap<String, String> hm;      
       try {
           hm = d.call_me("1FTKR1ED9APA75966");
           for(String key : hm.keySet())          {
       System.out.println(key+": "+hm.get(key));}
     
       } catch (Exception ex) {
           Logger.getLogger(SecondFrame.class.getName()).log(Level.SEVERE, null, ex);
       }
       
     
      input=find.getText();//WBAKC8C5XBC433829
       try {
           if(input!=null)
           {
               HashMap<String,String> vinInfo = d.call_me(input);
               if(vinInfo!=null){
               make.setText("Make: "+vinInfo.get("Make"));
               model.setText("Model: "+vinInfo.get("Model"));
               year.setText("Year: "+vinInfo.get("ModelYear"));
               body.setText("Body type: "+vinInfo.get("BodyClass")+", "+vinInfo.get("VehicleType"));
               engine.setText("Engine: "+vinInfo.get("EngineModel")+", "+vinInfo.get("FuelTypePrimary"));
               }
           }
       } catch (Exception ex) {
           Logger.getLogger(SecondFrame.class.getName()).log(Level.SEVERE, null, ex);
       }
   
   
   
   
   }
   }
   }
      /*
      small = new JRadioButton("WEOFWJFO232e239ej");
      add(small);
      med = new JRadioButton("weED2ED32E23E232wq");
      add(med);
      large = new JRadioButton("2ED2ED2E332E23E23");
      add(large);
      */

}
