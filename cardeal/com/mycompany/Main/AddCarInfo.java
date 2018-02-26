/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Samsung
 */
public class AddCarInfo extends JPanel{
    Image bg = new ImageIcon("C:\\Users\\John\\Desktop\\cardeal\\com\\mycompany\\Main\\pic.jpg").getImage();
    @Override
    public void paintComponent(Graphics g) {
    
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
    public AddCarInfo(){
        
    }
}