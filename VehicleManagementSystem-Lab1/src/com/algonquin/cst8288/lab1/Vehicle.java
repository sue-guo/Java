/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

/**
 * This is Vehicle class with vehicle common properties and abstract methods
 * @author Hongxiu Guo
 */
public abstract class Vehicle {
    /** manufacturer of  vehicle*/
    private String manufacturer;
    /** model of vehicle*/
    private String model;
    /** color of body*/
    private String color;
    /**manufacture year */
    private int year; 
    /** engine */
    private String engine;
    /**wheels number */
    private int wheels;
    /**headlights number */
    private int headlights;

    /**
     * Accessor for manufacturer
     * @return  manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Mutator for manufacturer
     * @param manufacturer 
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Accessor for model of vehicle
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * Mutator for model
     * @param model 
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Accessor for color of vehicle body
     * @return  color
     */
    public String getColor() {
        return color;
    }

    /**
     * Mutator for color
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Accessor for manufacture year
     * @return  year
     */
    public int getYear() {
        return year;
    }

    /**
     * Mutator for manufacture year
     * @param year 
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Accessor for engine
     * @return  engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Mutator for engine
     * @param engine 
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Accessor for wheels
     * @return wheels
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Mutator for wheels
     * @param wheels 
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Accessor for headlights number
     * @return  headlights number
     */
    public int getHeadlights() {
        return headlights;
    }

    /**
     * Mutator for headlights number
     * @param headlights 
     */
    public void setHeadlights(int headlights) {
        this.headlights = headlights;
    }
    
    public abstract void start();
    public abstract void stop();
    
    
}
