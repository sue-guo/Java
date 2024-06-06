/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

/**
 * This is Builder Director class, with a method determines the order to create a vehicle object
 * @author Hongxiu Guo
 */
public class VehicleDirector {
    /** a vehicleBuilder object*/
    private VehicleBuilder vehicleBuilder;
    /**
     * This method is to create a vehicle object step by step and with specific order
     * @param vBuilder 
     */
    public void builde(VehicleBuilder vBuilder){
        vehicleBuilder = vBuilder;
        vehicleBuilder.startBuild();
        vehicleBuilder.buildBody();
        vehicleBuilder.buildEngine();
        vehicleBuilder.buildHeadlights();
        vehicleBuilder.buildWheels();
        vehicleBuilder.stopBuild();

    }
}
