/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class Customer
{
public static void cinfo()
{
String search = JOptionPane.showInputDialog ("Enter customer's name: ");

if(search.equalsIgnoreCase("joe"))
{
JOptionPane.showMessageDialog(null,"[1] - Joe\nAccount #:12384932\nAddress: 123 Oswego Street, Liverpool NY 13088\nPhone number:(315)222-2222\n");
}
else
{
JOptionPane.showMessageDialog(null,"Customer not found");
}

}
}
