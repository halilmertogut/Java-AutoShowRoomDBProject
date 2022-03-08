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
public class Audi extends AutoShowRoom implements VehiclesInterface{
    private boolean rsPackage;

    public Audi(boolean rsPackage, int id, String vehicleModel, String vehicleType, String vehicleBrand, int modelYear, double miles) {
        super(id, vehicleModel, vehicleType, vehicleBrand, modelYear, miles);
        this.rsPackage = rsPackage;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+"\nRS Package :" + rsPackage;
    }
    

    @Override
    public double CalculatePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.modelYear < 2015 || this.vehicleType.equalsIgnoreCase("Sedan") || this.miles > 100000){
            this.price = 792000;
            if(this.rsPackage==true)
                this.price+=95000;
        }
        else if(this.modelYear > 2015 || this.vehicleType.equalsIgnoreCase("Sedan") || this.miles < 100000){
            this.price = 1450000;
            if(this.rsPackage==true)
                this.price+=250000;
        }
        else if(this.modelYear < 2015 || this.vehicleType.equalsIgnoreCase("hatchback") || this.miles > 100000)
            this.price = 492000;
        else if(this.modelYear > 2015 || this.vehicleType.equalsIgnoreCase("hatchback") || this.miles < 100000)
            this.price = 793000;
        return this.price;
    }

    @Override
    public double CalculateCommision() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.price * 0.12;
    }
    
}
