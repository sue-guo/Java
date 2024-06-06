/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

/**
 * This class is a subclass of Vehicle, override Vehicle abstract method
 * @author Hongxiu Guo
 */
public class Motorcycle extends Vehicle {

    /**
     * Implement start() method for Motorcycle
     */
    @Override
    public void start() {
        System.out.println("Motorcycle start---------------");
    }
    /**
     * Implement stop() method for Motorcycle
     */
    @Override
    public void stop() {
        System.out.println("Motorcycle stop---------------");
    }
    
}
