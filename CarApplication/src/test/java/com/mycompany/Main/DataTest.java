/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samsung
 */
public class DataTest {
    public Data d;
    ArrayList<CarInformation> carList;
    CarInformation car;
     ArrayList<String> vin = new ArrayList<String>();
    public DataTest() throws FileNotFoundException {
        d = new Data();
    }
    
    @BeforeClass
    public static void setUpClass() throws FileNotFoundException {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        d.readCarInfo();
        carList = d.getCarList();
        car = new CarInformation("a",1,1,1);
        vin.add("5XYKT3A69DG388088");
        vin.add("1GTJ6MF99C8101141");
        vin.add("WBAGL63413DP34065");
        vin.add("1LNBM9745JY711735");
        vin.add("1HGCD5532VA869266");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //test if it's correctly loaded or not
    @Test
    public void test1() {
        assertEquals(6, d.getCarList().size());
       
    }
    //test if it's added or not
    @Test
    public void test2(){
        d.addList(car);
        assertEquals(7, d.getCarList().size());
    }
    @Test
    public void test3(){
        d.addList(car);
        carList = d.sortMileage();
        
        assertEquals(1, d.getCarList().get(0).getMileage());
        assertEquals(7, d.getCarList().size());
    }
    @Test
    public void test4(){
        d.addList(car);
        carList = d.sortMileage();
        
        assertEquals(1, d.getCarList().get(0).getMileage());
        assertEquals(7, d.getCarList().size());
    }
    @Test
    public void test5(){
        carList = d.sortPrice();
        assertEquals(24877, carList.get(0).getPrice());
    }
    @Test
    public void test6(){
        assertEquals(27501, d.getCarList().get(0).getMileage());
    }
    @Test
    public void testIfSortedRightPrice(){
        carList = d.sortPrice();
        int i = 0;
        for(CarInformation ci : d.sortPrice()){
            assertTrue(ci.getPrice()>=i);
            i=ci.getPrice();
        }
    }
    @Test
    public void testIfSortedRightMileage(){
        carList = d.sortPrice();
        int i = 0;
        for(CarInformation ci : d.sortMileage()){
            assertTrue(ci.getMileage()>=i);
            i=ci.getMileage();
        }
    }
    @Test
    public void testIfAPIconnected() throws Exception{
        assertTrue(d.call_me(vin.get(0)).size()>0);
    }
    //test if vinnumber has error code
    @Test
    public void test7() throws Exception{
       
        for(String s : vin){
            assertEquals("0",d.call_me(s).get("ErrorCode").charAt(0)+"");
        }
    }
}

