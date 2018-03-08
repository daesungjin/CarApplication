/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbim01;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Samsung
 */
public class Main {
    JFrame jFrame = new JFrame("J다이얼로그 예제");
    JDialog jDialog = new JDialog(jFrame, "JDialog 타이틀");
    JButton jButton = new JButton("Click");
    JTextField textField = new JTextField("This is a text");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Your text here");

    // GUI 구현 생성자
    public Main() {
        // 다이얼로그에 버튼 추가
        urlStored us = new urlStored();
        
        // 기본 프레임 크기와 보기 설정
        jFrame.setSize(200, 200);

        //X버튼 누르면 프로그램 종료
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setText("");
        textField.setColumns(20);
        
       
        // 다이얼로그의 크기와 보기 설정
        panel.add(label);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    // System.out.println("The entered text is: " + textField.getText());
                    label.setText(us.resultCosine(textField.getText()));
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        panel.add(textField);
        jFrame.add(panel);

        jFrame.setVisible(true);
        //★X버튼 누르면 다이얼로그만 종료
        jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException ,NullPointerException{
//        UrlMeta us = new UrlMeta();
//        url u2 = new url("https://www.oswego.edu/");
//        for(String s : u2.sortMeta().keySet()){
//            System.out.println(s);
//        }
//        String s =us.resultCosine("http://gee.cs.oswego.edu/dl/");
//        
        //System.out.println(s);
        new Main();
        }}
  

