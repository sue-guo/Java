/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

/**
 * This is concrete class of VehicleBuilder, implement all methods in VehicleBuilder for Motorcycle
 * @author Hongxiu Guo
 */
public class MotorcycleBuilder implements VehicleBuilder {
    /** a Motorcycle object */
    private Vehicle motorcycle = new Motorcycle();
    /**
     * Implement buildEngine() for a motorcycle
     */      
    @Override
    public void buildEngine() {
        System.out.println("add motorcycle engine");
        motorcycle.setEngine("engine222");
    }

    /**
     * Implement buildWheels() for a motorcycle
     */
    @Override
    public void buildWheels() {
        System.out.println("added 2 wheels");
        motorcycle.setWheels(2);
    }
    /**
     * Implement buildBody() for a motorcycle
     */
    @Override
    public void buildBody() {
         System.out.println("build motorcycle body");
         motorcycle.setModel("Mode222");
         motorcycle.setManufacturer("Motor Brand");
         motorcycle.setYear(2024);
    }
    /**
     * Implement buildHeadlights() for a motorcycle
     */
    @Override
    public void buildHeadlights() {
        System.out.println("added 1 headlights");
        motorcycle.setHeadlights(1);
    }
    /**
     * This method return the new motorcycle object
     * @return motorcycle
     */
    @Override
    public Vehicle getVehicle() {
        return motorcycle;
    }
    /**
     * Implement startBuild() for a motorcycle
     */
    @Override
    public void startBuild() {
        motorcycle.start();
    }
    /**
     * Implement startBuild() for a motorcycle
     */
    @Override
    public void stopBuild() {
        motorcycle.stop();
    }
    
}
