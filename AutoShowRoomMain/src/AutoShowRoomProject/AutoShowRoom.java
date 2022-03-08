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
public abstract class AutoShowRoom {
    protected String vehicleModel,vehicleType,vehicleBrand;
    protected int id,modelYear;
    protected double miles,price,tax;
    public static int totalCar=0;

    public AutoShowRoom(int id, String vehicleModel, String vehicleType, String vehicleBrand, int modelYear, double miles) {
        this.id = id;
        this.vehicleModel = vehicleModel;
        this.vehicleType = vehicleType;
        this.vehicleBrand = vehicleBrand;
        this.modelYear = modelYear;
        this.miles = miles;
        totalCar++;
    }
    
    public boolean findID(int id){
        return this.id==id;
    }

    public int getId() {
        return id;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public double getMiles() {
        return miles;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double CalculatePrice();

    @Override
    public String toString() {
        return "\nID : " + id + "\nVehicle Model : " + vehicleModel + "\nVehicle Type : " + vehicleType + "\nVehicle Brand : " + vehicleBrand + "\nModel Year : " + modelYear + "\nMiles :" + miles + "\nPrice : " + price + "\nTax : " + tax + "\nTotal Vehicle : "+totalCar;
    }
    
    
}
