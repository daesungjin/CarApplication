
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.util.ArrayList;

/**
 *
 * @author Samsung
 */
public class CarList {
    private static ArrayList<CarInformation> ci;
    public CarList(){
        ci = new ArrayList<CarInformation>();
    }
    public ArrayList<CarInformation> getList(){
        return ci;
    }
    public void addList(CarInformation c){
        ci.add(c);
    }
}