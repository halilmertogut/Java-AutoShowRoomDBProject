/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoShowRoomProject;

/**
 *
 * @author halil
 */
public class Kawasaki extends AutoShowRoom {
    private int rrCapacity;

    public Kawasaki(int rrCapacity, int id, String vehicleModel, String vehicleType, String vehicleBrand, int modelYear, double miles) {
        super(id, vehicleModel, vehicleType, vehicleBrand, modelYear, miles);
        this.rrCapacity = rrCapacity;
    }

  

    @Override
    public String toString() {
        return "\n"+super.toString()+ "\nRR Capacity :" + rrCapacity;
    }

    @Override
    public double CalculatePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.modelYear < 2015 || this.miles > 100000){
            this.price = 30000;
            if(this.rrCapacity<125)
                this.price=20000;
        }
        else if(this.modelYear > 2015 ||  this.miles < 100000){
            this.price = 200000;
            if(this.rrCapacity<125)
                this.price=100000;
        }

        return this.price;
    }
    
    
}
