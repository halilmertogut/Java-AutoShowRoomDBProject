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
public class BMW extends AutoShowRoom {
    private boolean mPackage;

    public BMW(boolean mPackage, int id, String vehicleModel, String vehicleType, String vehicleBrand, int modelYear, double miles) {
        super(id, vehicleModel, vehicleType, vehicleBrand, modelYear, miles);
        this.mPackage = mPackage;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+" \nmPackage : " + mPackage;
    }
    
    
    

    

    @Override
    public double CalculatePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.modelYear < 2015 || this.vehicleType.equalsIgnoreCase("Sedan") || this.miles > 100000){
            this.price = 600000;
            if(this.mPackage==true)
                this.price+=50000;
        }
        else if(this.modelYear > 2015 || this.vehicleType.equalsIgnoreCase("Sedan") || this.miles < 100000){
            this.price = 1000000;
            if(this.mPackage==true)
                this.price+=100000;
        }
        else if(this.modelYear < 2015 || this.vehicleType.equalsIgnoreCase("hatchback") || this.miles > 100000)
            this.price = 475000;
        else if(this.modelYear > 2015 || this.vehicleType.equalsIgnoreCase("hatchback") || this.miles < 100000)
            this.price = 775000;
        
        return this.price;
        
    }


    
}
