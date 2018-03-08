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
public class Main extends JPanel {

    private JButton search, last, next, clear, addInfo, button1, button2,button3;
    private JTextField banner, infodisplay, info, displayrecord, line1, line2, line3, line4, input;
    private JTextArea textArea;
    Data data;
    boolean sd = false;
    Date d1 = new Date();
    ArrayList<CarInformation> carList;
    Image bg = new ImageIcon("C:\\Users\\Samsung\\Desktop\\hw2\\pic.jpg").getImage();

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }

    public JButton getAddInfo() {
        return addInfo;
    }

    public Main() throws FileNotFoundException {
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
        line3.setForeground(Color.black);
        line3.setBackground(Color.white);
        line3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        line3.setOpaque(false);
        //entering info

        input = new JTextField(80);
        add(input);
        input.setEditable(true);
        input.setEnabled(false);
        input.setHorizontalAlignment(JTextField.CENTER);
        input.setFont(new Font("Calibri", Font.BOLD, 22));
        input.setForeground(Color.white);
        input.setBackground(Color.black);
        input.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        input.setOpaque(false);

        search = new JButton("Look up inventory");
        add(search);
        search.setFont(new Font("Plain", Font.BOLD, 16));
        search.setOpaque(false);

        last = new JButton("Last Page");
        add(last);
        last.setEnabled(false);
        last.setFont(new Font("Plain", Font.BOLD, 16));
        last.setOpaque(false);

        button1 = new JButton("CarInventory");
        add(button1);
        button1.setVisible(true);
        button1.setFont(new Font("Plain", Font.BOLD, 16));
        button1.setOpaque(false);

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

        textArea = new JTextArea(15, 25);
        add(textArea);
        textArea.setForeground(Color.cyan);
        textArea.setBackground(Color.black);
        textArea.setOpaque(false);
        textArea.setEditable(false);

        button2 = new JButton("back");
        add(button2);
        button2.setVisible(false);
        button2.setFont(new Font("Plain", Font.BOLD, 16));
        button2.setOpaque(false);
        
        button3 = new JButton("Planner");
        add(button3);
        
        button3.setFont(new Font("Plain", Font.BOLD, 16));
        button3.setOpaque(false);
        
        setInventoryBoolean(false);
        banner.setVisible(true);
        DealerLookUpListener listener = new DealerLookUpListener();
        search.addActionListener(listener);
        last.addActionListener(listener);
        next.addActionListener(listener);
        clear.addActionListener(listener);
        addInfo.addActionListener(listener);
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        
    }
public void setInventoryBoolean(boolean b) {
        search.setVisible(b);
        last.setVisible(b);
        next.setVisible(b);
        clear.setVisible(b);
        addInfo.setVisible(b);
        
        
        infodisplay.setVisible(b);
        info.setVisible(b);
        displayrecord.setVisible(b);
        line1.setVisible(b);
        line2.setVisible(b);
        line3.setVisible(b);
        input.setVisible(b);
        textArea.setVisible(b);
        button2.setVisible(b);
    }
    public void setMainMenuBoolean(boolean b){
        button1.setVisible(b);
        button3.setVisible(b);
    }
    private class DealerLookUpListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String s = "";
            String s1 = "";
            if (data.readInfo().size() < 7) {
                for (int i = 0; i < data.readInfo().size(); i++) {
                    s += data.readInfo().get(i).toString();
                }
            } else {
                for (int i = 0; i < 7; i++) {
                    s += data.readInfo().get(i).toString();
                }
                for (int i = 7; i < data.readInfo().size(); i++) {
                    s1 += data.readInfo().get(i).toString();
                }
            }
            if (event.getSource() == button2) {
                setInventoryBoolean(false);
                setMainMenuBoolean(true);
            }
            if (event.getSource() == search) {

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
            if (event.getSource() == button1) {
                setInventoryBoolean(true);
                setMainMenuBoolean(false);
                
            }
            if (event.getSource() == next) {
                next.setEnabled(false);
                last.setEnabled(true);
                textArea.setText(s1);
                textArea.setFont(new Font("Plain", Font.BOLD, 22));
                textArea.setOpaque(true);
                textArea.setEditable(false);
                textArea.setHighlighter(null);

            }

            if (event.getSource() == last) {

                textArea.setText(s);
                textArea.setFont(new Font("Plain", Font.BOLD, 22));
                next.setEnabled(true);
                textArea.setOpaque(true);
                textArea.setEditable(false);
                textArea.setHighlighter(null);
            }

            if (event.getSource() == clear) {
                textArea.setText("");
                textArea.setOpaque(false);
                displayrecord.setText("");
                search.setEnabled(true);
                last.setEnabled(false);
                next.setEnabled(false);
                clear.setEnabled(false);

                input.setText("");
            }
            if (event.getSource() == addInfo) {

                line3.setOpaque(true);
                line3.setForeground(Color.black);
                line3.setBackground(Color.white);

                line3.setText("Enter Make & model,price,mileage,engine below: ");
                line3.setEditable(false);

                input.setOpaque(true);
                input.setEnabled(true);

                if (sd) {
                    if(input.getText()==null) return;
                    String st = input.getText();
                    
                    String[] property =st.split(",");
                    if(property.length!=4) return;
                    if (st != null) {                        

                        CarInformation ci = new CarInformation(property[0], Integer.parseInt(property[1]), Integer.parseInt(property[2]), Integer.parseInt(property[3]));
                        data.addList(ci);

                        input.setText("");

                    }
                }
                if (sd == false) {
                    sd = true;
                } else {
                    sd = false;
                }
                line3.setEnabled(sd);

                last.setEnabled(false);
                next.setEnabled(false);
                clear.setEnabled(true);

            }

        }

    }

    
}
