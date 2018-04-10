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

public class TestDrive
{
public static void TD()
{

String pick = JOptionPane.showInputDialog("Enter car # on list to schedule a test drive. ");
String yes;
String time;


switch(pick)
{//start switch

      case "5":
      {
      JOptionPane.showMessageDialog (null,"Vehicle: [5] - 2017 McLaren P1");   
      

      time = JOptionPane.showInputDialog ("Please enter date or time for test drive: \n");
      
      JOptionPane.showMessageDialog(null,"Test drive requested, here is your appointment:\n\n" + "Requested Time: >" + time);
      
            
      yes = JOptionPane.showInputDialog ("Enter any key to confirm, or type 'x' to cancel.");
      
      if(yes.equalsIgnoreCase("x"))
      {
          JOptionPane.showMessageDialog (null, "Request canceled.");
     System.exit(0);
      }
      JOptionPane.showMessageDialog(null,"Request confirmed.");
            
            }
            
            
      break;
      
      


}

}
}
