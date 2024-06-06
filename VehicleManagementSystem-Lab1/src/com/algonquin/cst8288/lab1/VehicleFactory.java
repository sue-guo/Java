/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

/**
 * This Simple Factory class instances of vehicles based on user input. 
 * @author Hongxiu Guo
 */
public class VehicleFactory {
    
    /**
     * Build a specific vehicle object according to the input string
     * type = "car", build a car object;
     * type = "motorcycle", build a motorcycle object;
     * @param type
     * @return a vehicle object
     */
    public Vehicle makeVehicle(String type){
        Vehicle newVehicle = null;
        VehicleDirector director = new VehicleDirector();
        //create different type of Vehicle
        if(type.equalsIgnoreCase("car")){
            VehicleBuilder carBuilder = new CarBuilder();
            director.builde(carBuilder);
            newVehicle = carBuilder.getVehicle();
            
        }else if(type.equalsIgnoreCase("Motorcycle")){
            VehicleBuilder motorBuilder = new MotorcycleBuilder();
            director.builde(motorBuilder);
            newVehicle = motorBuilder.getVehicle();
        }
        
        return newVehicle;
    }
    
}
