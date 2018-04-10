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
import javax.swing.JOptionPane;



public class CarListMenu
{
public static void activate()
{

//JOptionPane.showMessageDialog(null, "" );


}

public static void sales()
{
String choice = JOptionPane.showInputDialog("Enter car # on list to continue: ");
String confirm;


      switch(choice)
      {//start switch
      
      
      
      case "1":
      {
      JOptionPane.showMessageDialog (null,"Vehicle: [1] - 2013 Mazda 3 iSport sedan (50,032 miles) \nPrice: $12,999\nSales Tax(8%): $1,039.92\nTotal cost: $14,038.92\n");   
      confirm = JOptionPane.showInputDialog ("Enter any key to confirm, or type 'x' to exit.");
      
      if(confirm.equalsIgnoreCase("x"))
         {
          JOptionPane.showMessageDialog (null, "Purchase canceled.");
     System.exit(0);
      }



      JOptionPane.showMessageDialog (null,"Purchase completed!");
      
      JOptionPane.showMessageDialog(null, "              ***Updated Inventory***\n\n\n[1] - 2013 Mazda 3 iSport sedan (50,032 miles) $12,999**********SOLD**********\n[2] - 2011 BMW M4 convertible (25,560 miles) $42,500\n"
                              + "[3] - 2018 Corvette Z06 convertible (100 miles) $78,900\n[4] - 2015 Mustang GT Coupe (19,924 miles) $29,850\n"
                              + "[5] - 2017 McLaren P1 (2,530 miles) $1,200,000\n" );
      
            }
      break;
      
      case "2":
      {
      JOptionPane.showMessageDialog (null,"Vehicle: [2] - 2011 BMW M4 convertible (25,560 miles)  \nPrice: $42,500\nSales Tax(8%): $3,400\nTotal cost: $45,900\n");   
      confirm = JOptionPane.showInputDialog ("Enter any key to confirm, or type 'x' to exit.");
      
      if(confirm.equalsIgnoreCase("x"))
         {
          JOptionPane.showMessageDialog (null, "Purchase canceled.");
     System.exit(0);
      }



      JOptionPane.showMessageDialog (null,"Purchase completed!");
      
      JOptionPane.showMessageDialog(null, "              ***Updated Inventory***\n\n\n[1] - 2013 Mazda 3 iSport sedan (50,032 miles) $12,999\n[2] - 2011 BMW M4 convertible (25,560 miles) $42,500**********SOLD**********\n"
                              + "[3] - 2018 Corvette Z06 convertible (100 miles) $78,900\n[4] - 2015 Mustang GT Coupe (19,924 miles) $29,850\n"
                              + "[5] - 2017 McLaren P1 (2,530 miles) $1,200,000\n" );
      
            }
      break;

      case "3":
      {
      JOptionPane.showMessageDialog (null,"Vehicle: [3] - 2018 Corvette Z06 convertible (100 miles)  \nPrice: $78,900\nSales Tax(8%): $6,312\nTotal cost: $85,212\n");   
      confirm = JOptionPane.showInputDialog ("Enter any key to confirm, or type 'x' to exit.");
      
      if(confirm.equalsIgnoreCase("x"))
         {
          JOptionPane.showMessageDialog (null, "Purchase canceled.");
     System.exit(0);
      }



      JOptionPane.showMessageDialog (null,"Purchase completed!");
      
      JOptionPane.showMessageDialog(null, "              ***Updated Inventory***\n\n\n[1] - 2013 Mazda 3 iSport sedan (50,032 miles) $12,999\n[2] - 2011 BMW M4 convertible (25,560 miles) $42,500\n"
                              + "[3] - 2018 Corvette Z06 convertible (100 miles) $78,900**********SOLD**********\n[4] - 2015 Mustang GT Coupe (19,924 miles) $29,850\n"
                              + "[5] - 2017 McLaren P1 (2,530 miles) $1,200,000\n" );
      
            }
      break;
      
      case "4":
      {
      JOptionPane.showMessageDialog (null,"Vehicle: [4] - 2015 Mustang GT Coupe (19,924 miles)  \nPrice: $29,850\nSales Tax(8%): $2,388\nTotal cost: $32,238\n");   
      confirm = JOptionPane.showInputDialog ("Enter any key to confirm, or type 'x' to exit.");
      
      if(confirm.equalsIgnoreCase("x"))
         {
          JOptionPane.showMessageDialog (null, "Purchase canceled.");
     System.exit(0);
      }



      JOptionPane.showMessageDialog (null,"Purchase completed!");
      
      JOptionPane.showMessageDialog(null, "              ***Updated Inventory***\n\n\n[1] - 2013 Mazda 3 iSport sedan (50,032 miles) $12,999\n[2] - 2011 BMW M4 convertible (25,560 miles) $42,500\n"
                              + "[3] - 2018 Corvette Z06 convertible (100 miles) $78,900\n[4] - 2015 Mustang GT Coupe (19,924 miles) $29,850**********SOLD**********\n"
                              + "[5] - 2017 McLaren P1 (2,530 miles) $1,200,000\n" );
      
            }
      break;
      
      
      case "5":
      {
      JOptionPane.showMessageDialog (null,"Vehicle: [5] - 2017 McLaren P1 (2,530 miles)\nPrice: $1,200,000\nSales Tax(8%): $96,000\nTotal cost: $1,296,000\n");   
      confirm = JOptionPane.showInputDialog ("Enter any key to confirm, or type 'x' to exit.");
      
      if(confirm.equalsIgnoreCase("x"))
         {
          JOptionPane.showMessageDialog (null, "Purchase canceled.");
     System.exit(0);
      }



      JOptionPane.showMessageDialog (null,"Purchase completed!");
      
      JOptionPane.showMessageDialog(null, "              ***Updated Inventory***\n\n\n[1] - 2013 Mazda 3 iSport sedan (50,032 miles) $12,999\n[2] - 2011 BMW M4 convertible (25,560 miles) $42,500\n"
                              + "[3] - 2018 Corvette Z06 convertible (100 miles) $78,900\n[4] - 2015 Mustang GT Coupe (19,924 miles) $29,850\n"
                              + "[5] - 2017 McLaren P1 (2,530 miles) $1,200,000**********SOLD**********\n" );
      
            }
      break;
             
     
      
       
            default:
      JOptionPane.showMessageDialog (null, "Error, please try again.");
      

         
         }//end switch


}//end sales
}

