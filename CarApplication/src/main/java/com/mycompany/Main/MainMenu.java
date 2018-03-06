/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Samsung
 */
public class MainMenu extends JPanel implements ActionListener{
    JButton search;
    Main m;
    public MainMenu(){
       search = new JButton("Look up inventory"); 
      add(search);
      search.setFont(new Font("Plain", Font.BOLD, 16));
      search.setOpaque(false);
      search.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.removeAll();
        
       this.repaint();
        
        this.revalidate();
        try {
            m = new Main();
            m.setVisible(true);
            this.setVisible(false);
            this.add(m);
            this.repaint();
        this.revalidate();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
       
        
    }
    
}
