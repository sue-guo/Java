/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

/**
 * This is concrete class of VehicleBuilder, implement all methods in VehicleBuilder
 * @author Hongxiu Guo
 */
public class CarBuilder implements VehicleBuilder {
    /** a Car object */
    private Vehicle car = new Car();
    /**
     * Implement buildBody() for a Car
     */
    @Override
    public void buildBody() {
         System.out.println("build car body");
         car.setModel("Model 111");
         car.setManufacturer("CarBrand");
         car.setYear(2024);
    }
    /**
     * Implement buildEngine() for a Car
     */
    @Override
    public void buildEngine() {
        System.out.println("add car engine");
        car.setEngine("engine 333");
    }
    /**
     * Implement buildWheels() for a Car
     */
    @Override
    public void buildWheels() {
        System.out.println("added 4 wheels");
        car.setWheels(4);
    }
    /**
     * Implement buildHeadlights() for a Car
     */
    @Override
    public void buildHeadlights() {
        System.out.println("added 2 headlights");
        car.setHeadlights(2);
    }
    /**
     * This method return the new car object
     * @return car
     */
    @Override
    public Vehicle getVehicle() {
        return car;
    }
    /**
     * Implement startBuild() for a Car
     */
    @Override
    public void startBuild() {
        car.start();
    }
    /**
     * Implement stopBuild() for a Car
     */
    @Override
    public void stopBuild() {
        car.stop();
    }
}
