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
public class Mercedes extends AutoShowRoom implements VehiclesInterface{
    private boolean amgPackage;

    public Mercedes(boolean amgPackage, int id, String vehicleModel, String vehicleType, String vehicleBrand, int modelYear, double miles) {
        super(id, vehicleModel, vehicleType, vehicleBrand, modelYear, miles);
        this.amgPackage = amgPackage;
    }
    

    @Override
    public double CalculatePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(this.modelYear < 2015 || this.vehicleType.equalsIgnoreCase("Sedan") || this.miles > 100000){
            this.price = 750000;
            if(this.amgPackage==true)
                this.price+=65000;
        }
        else if(this.modelYear > 2015 || this.vehicleType.equalsIgnoreCase("Sedan") || this.miles < 100000){
            this.price = 1300000;
            if(this.amgPackage==true)
                this.price+=150000;
        }
        else if(this.modelYear < 2015 || this.vehicleType.equalsIgnoreCase("hatchback") || this.miles > 100000)
            this.price = 552000;
        else if(this.modelYear > 2015 || this.vehicleType.equalsIgnoreCase("hatchback") || this.miles < 100000)
            this.price = 875000;
        
        return this.price;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+" Amg Package :" + amgPackage;
    }

    @Override
    public double CalculateCommision() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.price * 0.15;
    }
    
    
    
}
