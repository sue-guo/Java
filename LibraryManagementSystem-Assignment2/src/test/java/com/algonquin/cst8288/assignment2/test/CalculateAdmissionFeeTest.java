/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment2.test;

import com.algonquin.cst8288.assignment2.event.BookLaunchEvent;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.KidsStoryEvent;
import com.algonquin.cst8288.assignment2.event.MovieNightEvent;
import com.algonquin.cst8288.assignment2.event.WorkShopEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * This test class for test different event calculate Admission Fee method
 * @author Hongxiu Guo
 */
public class CalculateAdmissionFeeTest {
    
    private Event event;
     private final double DELTA = 0.001;
    
    @Before
    public void setUp() {
       
    }
    
    @After
    public void tearDown() {
        event = null;
       
    }
    /**
     * Test calculateAdmissionFee method for BookLaunchEvent
     */
    @Test
    public void testBookLaunchEvent(){
        event = new BookLaunchEvent();
        double admissionFee = event.calculateAdmissionFee();
        double expectValue = 4.0;
        assertEquals("calculateAdmissionFee() in BookLaunchEvent return value does not match the expectations",expectValue, admissionFee, DELTA);
    }
    
    /**
     * Test calculateAdmissionFee method for KidsStoryEvent
     */
    @Test
    public void testKidsStoryEvent(){
        event = new KidsStoryEvent();
        double admissionFee = event.calculateAdmissionFee();
        double expectValue = 3.0;
        assertEquals("calculateAdmissionFee() in KidsStoryEvent return value does not match the expectations",expectValue, admissionFee, DELTA);
    }
    /**
     * Test calculateAdmissionFee method for MovieNightEvent
     */
    @Test
    public void testMovieNightEvent(){
        event = new MovieNightEvent();
        double admissionFee = event.calculateAdmissionFee();
        double expectValue = 7.5;
        assertEquals("calculateAdmissionFee() in MovieNightEvent return value does not match the expectations",expectValue, admissionFee, DELTA);
    
    }
    /**
     * Test calculateAdmissionFee method for WorkShopEvent
     */
    @Test
    public void testWorkShopEvent(){
        event = new WorkShopEvent();
        double admissionFee = event.calculateAdmissionFee();
        double expectValue = 15.0;
        assertEquals("calculateAdmissionFee() in WorkShopEvent return value does not match the expectations",expectValue, admissionFee, DELTA);
    
    }
}
