/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.util.HashMap;

/**
 *
 * @author Samsung
 */
public class CarInformation {
    private String make, model, EngineModel, FuelTypePrimary, ModelYear, VehicleType, CarInformation;
    private int price, mileage, engine;
    private HashMap<String, String> vinInfo;
    public CarInformation(String m1, int p, int m, int e){
        make = m1;
        price = p;
        mileage = m;
        engine = e;        
    }
    public CarInformation(HashMap<String, String> hm){
        vinInfo = hm;
        make = hm.get("make");
        
        if(hm.get("FuelTypePrimary")!=null)
        FuelTypePrimary = hm.get("FuelTypePrimary");
        
        if(hm.get("VehicleType")!=null)
        VehicleType = hm.get("VehicleType");
        
        if(hm.get("ModelYear")!=null)
        ModelYear = hm.get("ModelYear");
        
        if(hm.get("EngineModel")!=null)
        EngineModel = hm.get("EngineModel");
    }
    public String toString(){
        return make+"\n"+"   Price: $"+price+"     Mileage: "+mileage+"km    Engine:" + engine+" cyclone\n";
    }
    public String toString1(){
        return make+","+price+","+mileage+","+engine;
    }
    public String getMake(){
        return make;
    }
    public int getPrice(){
        return price;
    }
    public int getMileage(){
        return mileage;
    }
    public int getEngine(){
        return engine;
    }
}
