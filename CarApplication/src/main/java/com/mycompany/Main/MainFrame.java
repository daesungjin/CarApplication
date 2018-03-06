/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Samsung
 */
public class MainFrame extends JFrame{
    Main panel;
     
    
    public MainFrame() throws FileNotFoundException{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
      
      
      panel = new Main();
      this.add(panel);
      this.pack();
      this.setSize(1000,850);
      this.setResizable(false);
      this.setVisible(true);
      this.setLocationRelativeTo(null);
      
      
      
    }
    public static void main(String[] args) throws FileNotFoundException
   {  

      MainFrame frame = new MainFrame();
      
   }

   
}
