/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.algonquin.cst8288.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hongxiu Guo
 */
public class VehicleDirector_Test {
    
    private VehicleFactory factory;
    
    @BeforeEach
    public void setUp() {
        factory = new VehicleFactory();
    }
    
    @AfterEach
    public void tearDown() {
        factory = null;
    }
    
    
    @Test
    public void testMakeVehicle_InvalidType() {
        Vehicle vehicle = factory.makeVehicle("Hello");
        assertNull(vehicle, "The factory should return null when use an invalid type");
    }
    /**
     * Test create a car through testMakeVehicle() method
     */
    @Test
    public void testMakeVehicle_Car() {
        Vehicle vehicle = factory.makeVehicle("car");
        assertNotNull(vehicle,"No vehicle created through VehicleFactory.");
        assertTrue(vehicle instanceof Car, "The created vehicle should be an instance of Car"); 
    }
    @Test
    public void testMakeVehicle_Motorcycle() {
        Vehicle vehicle = factory.makeVehicle("Motorcycle");
        assertNotNull(vehicle,"No vehicle created through VehicleFactory.");
        assertTrue(vehicle instanceof Motorcycle, "The created vehicle should be an instance of Motorcycle"); 
    }
}
