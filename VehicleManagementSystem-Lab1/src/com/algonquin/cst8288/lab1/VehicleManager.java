/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

import java.util.ArrayList;

/**
 * This is Singleton Pattern class, only one instance to manages all vehicles in the system.
 * @author Hongxiu Guo
 */
public class VehicleManager {
    /* private static variable that stores reference to single instance */
    private static VehicleManager vehicleManager;
    /* ArrayList to keep the Vehicles*/
    private ArrayList<Vehicle> vehicles;
    
    /* Private constructor, so no other class can call it and create other instances */
    private VehicleManager(){
        vehicles = new ArrayList<>();
    }
    
    /* Static method that returns reference to single instance.
     * Initializes it only once, if not initialized before */
    public static VehicleManager getInstance(){
        if (vehicleManager == null) {
            vehicleManager = new VehicleManager();
        }
        
        return vehicleManager;
    }
    /**
     * Add new vehicle 
     * @param vehicle 
     */
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    /**
     * Get all vehicles
     * @return vehicles in arrayList
     */
    public ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }
    
}
