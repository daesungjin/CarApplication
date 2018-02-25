/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc365hw01;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import ;
/**
 *
 * @author Samsung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        
       URL u;
  Scanner s;
  u = new URL("http://www.google.com");
  s = new Scanner(u.openStream());
  while(s.hasNext()){
   System.out.println("\n"+s.nextLine());}
        

        }
    }
    

