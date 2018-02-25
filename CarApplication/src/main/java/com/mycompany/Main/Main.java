/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Samsung
 */
public class Main extends JPanel{
    private JButton search,last,next,clear,addInfo;
   private JTextField banner,infodisplay,info,displayrecord,line1,line2, line3, line4;
   private JTextArea textArea;
   Data data;
   boolean sd=false;
   Date d1 = new Date();
   ArrayList<CarInformation> carList;
    Image bg = new ImageIcon("C:\\Users\\Samsung\\Desktop\\hw2\\pic.jpg").getImage();
    @Override
    public void paintComponent(Graphics g) {
    
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
    public JButton getAddInfo(){
        return addInfo;
    }
    
   public Main() throws FileNotFoundException
   {
        this.data = new Data();
        data.readInfo();
        
     
      
      banner = new JTextField(80);
      add(banner);
      banner.setEditable(false);
      banner.setText("Oswego Car Dealership");
      banner.setHorizontalAlignment(JTextField.CENTER);
      banner.setFont(new Font("Calibri", Font.BOLD, 50));
      banner.setForeground(Color.black);       
      banner.setBackground(Color.white);
      banner.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      banner.setOpaque(false);
      
      line1 = new JTextField(80);
      add(line1);
      line1.setEditable(false);
      line1.setText("----------------------------------------------------------");
      line1.setHorizontalAlignment(JTextField.CENTER);
      line1.setFont(new Font("Calibri", Font.BOLD, 22));
      line1.setForeground(Color.blue);
      line1.setBackground(Color.white);
      line1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      line1.setOpaque(false);
     
      
      info = new JTextField(80);
      add(info);
      info.setEditable(false);
      info.setText("Please choose your option below:");
      info.setHorizontalAlignment(JTextField.CENTER);
      info.setFont(new Font("Calibri", Font.BOLD, 22));
      info.setForeground(Color.red); 
      info.setBackground(Color.white);
      info.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      info.setOpaque(false);
      
      line2 = new JTextField(80);
      add(line2);
      line2.setEditable(false);
      line2.setText("----------------------------------------------------------");
      line2.setHorizontalAlignment(JTextField.CENTER);
      line2.setFont(new Font("Calibri", Font.BOLD, 22));
      line2.setForeground(Color.green);
      line2.setBackground(Color.white);
      line2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      line2.setOpaque(false);
     
      line3 = new JTextField(80);
      add(line3);
      line3.setEditable(true);
      line3.setEnabled(false);
      line3.setHorizontalAlignment(JTextField.CENTER);
      line3.setFont(new Font("Calibri", Font.BOLD, 22));
      line3.setForeground(Color.green);
      line3.setBackground(Color.black);
      line3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      line3.setOpaque(false);
      //entering info
      search = new JButton("Look up inventory"); 
      add(search);
      search.setFont(new Font("Plain", Font.BOLD, 16));
      search.setOpaque(false);
      
      last = new JButton("Last Page"); 
      add(last);
      last.setEnabled(false);
      last.setFont(new Font("Plain", Font.BOLD, 16));
      last.setOpaque(false);
      
      next = new JButton("Next Page"); 
      add(next);
      next.setFont(new Font("Plain", Font.BOLD, 16));
      next.setOpaque(false);
      next.setEnabled(false);
      

      
      clear = new JButton("Reset");
      add(clear);
      clear.setFont(new Font("Plain", Font.BOLD, 16));
      clear.setOpaque(false);
      clear.setEnabled(false);  
      
      addInfo = new JButton("add Information."); 
      add(addInfo);
      addInfo.setFont(new Font("Plain", Font.BOLD, 16));
      addInfo.setOpaque(false);
      addInfo.setEnabled(true);
      
      infodisplay = new JTextField(80);
      add(infodisplay);
      infodisplay.setEditable(false);
      infodisplay.setText("----------------------------------------------------------");
      infodisplay.setHorizontalAlignment(JTextField.CENTER);
      infodisplay.setFont(new Font("Calibri", Font.BOLD, 22));
      infodisplay.setForeground(Color.cyan);
      infodisplay.setBackground(Color.white);
      infodisplay.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      infodisplay.setOpaque(false);

  
      
     
      displayrecord = new JTextField(80);
      add(displayrecord);
      displayrecord.setEditable(false);
      displayrecord.setHorizontalAlignment(JTextField.CENTER);
      displayrecord.setFont(new Font("Calibri", Font.BOLD, 22));
      displayrecord.setForeground(Color.black); 
      displayrecord.setBackground(Color.white);
      displayrecord.setBorder(javax.swing.BorderFactory.createEmptyBorder());
      displayrecord.setOpaque(false);
      
      textArea = new JTextArea( 15,25);
      add(textArea);
      textArea.setForeground(Color.cyan);
      textArea.setBackground(Color.black);
      textArea.setOpaque(false);
      
      
      
     
      DealerLookUpListener listener = new DealerLookUpListener();
      search.addActionListener(listener);
      last.addActionListener(listener);
      next.addActionListener(listener);
      clear.addActionListener(listener);
      addInfo.addActionListener(listener);
      }
     
      private class DealerLookUpListener implements ActionListener 
         { 
            public void actionPerformed(ActionEvent event)
            {
           
            String s = "";
            for(CarInformation ci : data.getCarList()){
                s+=ci.toString();
            }
            if(event.getSource() == search)
            {
            clear.setEnabled(true);  
            last.setEnabled(false);
            next.setEnabled(true);          
            displayrecord.setText("Data found - " + d1);
            search.setEnabled(false);
            textArea.setText(s);  
            textArea.setFont(new Font("Plain", Font.BOLD, 22));
            textArea.setOpaque(true);
            textArea.setEditable(false);
            textArea.setHighlighter(null);
            }
            
            if(event.getSource() == next)
            {
            next.setEnabled(false);
            last.setEnabled(true);
            textArea.setText("");  
            textArea.setFont(new Font("Plain", Font.BOLD, 22));
            textArea.setOpaque(true);
            textArea.setEditable(false);
            textArea.setHighlighter(null);
                       
            }
            
            if(event.getSource() == last)
            {
            
            textArea.setText(s);
            textArea.setFont(new Font("Plain", Font.BOLD, 22));
            next.setEnabled(true);
            textArea.setOpaque(true);
            textArea.setEditable(false);
            textArea.setHighlighter(null);
            }
                        
            if(event.getSource() == clear)
            {
            textArea.setText("");
            textArea.setOpaque(false);
            displayrecord.setText("");
            search.setEnabled(true);
            last.setEnabled(false);
            next.setEnabled(false);
            clear.setEnabled(false);
            }
            if(event.getSource()== addInfo){
               
                if(sd){
                String st = line3.getText();
                String[] property = new String[5];
                if(st!=null){
                     property = st.split(",");
                 
                     CarInformation ci = new CarInformation(property[0],Integer.parseInt(property[1]), Integer.parseInt(property[2]), Integer.parseInt(property[3]));
                     data.addList(ci);
                }
                }
                 if(sd == false) {sd = true;} else{sd = false;}
                 line3.setEnabled(sd);
                last.setEnabled(false);
                next.setEnabled(false);
                clear.setEnabled(true);
                
            }
           
            
            }
      
         }
}
