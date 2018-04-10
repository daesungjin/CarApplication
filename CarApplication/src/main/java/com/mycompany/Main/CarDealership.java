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
//package carD;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarDealership 
{
   private String[] options = {"Lookup Inventory", "Customer Info", "Sales", "Test Drive"};
   private JComboBox<String> list = new JComboBox<String>(options);
   private JFrame frame = new JFrame();
   private JFrame frame2 = new JFrame();
   private JButton submit, view;
   private JTextField name, space, vin;
   
   
   public CarDealership()
   {
      submit = new JButton("Submit");
      view = new JButton("View");
      
      name = new JTextField(20);
      frame.add(name);
      name.setEditable(false);
      name.setText("Welcome, select your option below");
      name.setHorizontalAlignment(JTextField.CENTER);
      name.setFont(new Font("Calibri", Font.BOLD, 25));
      name.setForeground(Color.BLACK);
      name.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      
      space = new JTextField(30);
      frame.add(space);
      space.setEditable(false);
      space.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      space.setBorder(javax.swing.BorderFactory.createEmptyBorder());

      vin = new JTextField(15);
      
      
      
         
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setPreferredSize(new Dimension(400,200));
      frame.setLayout(new FlowLayout());
      frame.add(list);
      frame.add(submit);
      frame.setTitle("Car Dealership");
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      DealerListener listener = new DealerListener();
      submit.addActionListener(listener);
      
     
      
  
    }
   
   public static void main(String[] args)
   {
   CarDealership begin = new CarDealership();
   }
   
  
   
   
   private class DealerListener implements ActionListener
   {
   public void actionPerformed(ActionEvent event)
   {
   if(event.getSource()==submit)
   {
      if(list.getSelectedItem().equals("Lookup Inventory"))
      {
      SecondFrame fr;
          try {
              fr = new SecondFrame();
               fr.setVisible(true);
      fr.setSize(400,400);
      fr.setTitle("Inventory");
          } catch (FileNotFoundException ex) {
              Logger.getLogger(CarDealership.class.getName()).log(Level.SEVERE, null, ex);
          }
     
      //carlist.activate();
     
      }
      else if(list.getSelectedItem().equals("Sales"))
      {
      CarListMenu.sales();
      }
      else if(list.getSelectedItem().equals("Customer Info"))
      {
      Customer.cinfo();
      }
      else if(list.getSelectedItem().equals("Test Drive"))
      {
      TestDrive.TD();
            }
      
   }
   }
   }
   
   
   
}
   
