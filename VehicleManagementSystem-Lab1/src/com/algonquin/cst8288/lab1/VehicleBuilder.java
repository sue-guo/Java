/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.algonquin.cst8288.lab1;

/**
 * This is Builder Interface for Vehicle, defines a set of methods for building 
 * the different parts of Vehicle
 * @author Hongxiu Guo
 */
public interface VehicleBuilder {
    
    void startBuild();
    void buildBody();
    void buildEngine();
    void buildWheels();
    void buildHeadlights();
    void stopBuild();
    
    Vehicle getVehicle();
    
}
