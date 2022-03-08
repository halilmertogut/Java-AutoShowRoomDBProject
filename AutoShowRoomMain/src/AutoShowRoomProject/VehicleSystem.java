/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoShowRoomProject;

import java.util.ArrayList;

/**
 *
 * @author halil
 */
public class VehicleSystem {
    public static ArrayList<AutoShowRoom> list = new ArrayList<>();
    public static ArrayList<Kawasaki> motor = new ArrayList<>();

    
    
     public static boolean checkID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findID(id)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean addVehicle(boolean pack , String typ , int rr ,int id, String vehicleModel, String vehicleType, String vehicleBrand, int modelYear, double miles){
        BMW b;
        Mercedes m;
        Audi a;
        Kawasaki k;
        typ="";
        if (!checkID(id)) {
            if (vehicleBrand.equalsIgnoreCase("Mercedes")) {
                m = new Mercedes(pack, id, vehicleModel, vehicleType, vehicleBrand,modelYear, miles);
                list.add(m);
            } else if(vehicleBrand.equalsIgnoreCase("Audi")){
                a = new Audi(pack, id, vehicleModel, vehicleType, vehicleBrand,modelYear, miles);
                list.add(a);
            }
            else if(vehicleBrand.equalsIgnoreCase("BMW")){

                b = new BMW(pack, id, vehicleModel, vehicleType, vehicleBrand,modelYear, miles);
                list.add(b);
                }
            else if(vehicleBrand.equalsIgnoreCase("Kawasaki") || vehicleType.equalsIgnoreCase("Motorcycle")){

                k = new Kawasaki(rr, id, vehicleModel, vehicleType, vehicleBrand,modelYear, miles);
                list.add(k);
                motor.add(k);
                }
               return true;
        }
            
            
        
    
        return false;

    }
    
        public static AutoShowRoom removeVehicle(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id)
            {
                return list.remove(i);
                
            }
        }
        return null;
        }
        
        public static String displayVehicles(){
            String msg = "";
            for (int i = 0; i < list.size(); i++){
                msg+=list.get(i).toString();
            }
            return msg;
        }
        
        public static String SearchSelectedVehicle(int id){
            String msg="";
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getId()==id)
                    msg+=list.get(i).toString();
            }
            return msg;
        }
        
        public static void CalculateTax(){
            double tax=0;
            for (int i = 0; i < list.size(); i++){
                if(list.get(i).modelYear == 2021)
                    tax = 5327;
                else if( list.get(i).modelYear > 2015 || list.get(i).modelYear < 2020)
                    tax = 3681;
                else if( list.get(i).modelYear > 2015 || list.get(i).modelYear < 2018)
                    tax = 2189;
                else if (list.get(i).modelYear < 2015)
                    tax = 681;
                
                list.get(i).setTax(tax);
                        
            }
           
            }
        
        public static void calculatePriceAll(){
            double price;
            for (int i = 0; i < list.size(); i++){
                list.get(i).setPrice(list.get(i).CalculatePrice());
            }
           
        }
        
         public static String displayMotor(){
            String msg = "";
            for (int i = 0; i < motor.size(); i++){
                msg+=motor.get(i).toString();
            }
            return msg;
        }
        
}


