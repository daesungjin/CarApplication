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
public class CarInformation {
    private String name;
    private int price, mileage, engine;
    public CarInformation(){
        
    }
    public CarInformation(String n, int p, int m, int e){
        name = n;
        price = p;
        mileage = m;
        engine = e;
    }
    public String toString(){
        return name+"\n"+"   Price: $"+price+"     Mileage: "+mileage+"km    Engine:" + engine+" cyclone\n";
    }
    public String toString1(){
        return name+","+price+","+mileage+","+engine;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int geMileage(){
        return mileage;
    }
    public int getEngine(){
        return engine;
    }
}
