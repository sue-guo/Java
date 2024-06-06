/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test ContractEmployeeImpl class 
 * @author Hongxiu Guo
 */
public class ContractEmployeeImpl_Test {
    
    private ContractEmployeeImpl contractEmployeeImpl;
    private Employee employee;
    private final double DELTA = 0.001;
    
    @Before
    public void setUp() {
        contractEmployeeImpl = new ContractEmployeeImpl();
        employee = new Employee("Sue Guo","ssjj@gamil.com",60000,3);
    }
    
    @After
    public void tearDown() {
        contractEmployeeImpl = null;
        employee = null;
    }
    
    /**
     * Test renewalDate() method
     */
    @Test
    public void TestRenewalDate(){
        //set the date to 1 year later
        Calendar calendar = Calendar.getInstance();
        //the month start from 0, may = 4;
        calendar.set(2025, 4, 23);
        Date expectedDate = calendar.getTime();
        Date actualDate = contractEmployeeImpl.renewalDate();
        assertEquals(expectedDate,actualDate);
    }
    /**
     * Test calculateTotalCompensation() method with invalid employee
     */
     @Test
     public void TestCalculateTotalCompensationWithNull() {
         final double expectValue = 0.0;
         double actualValue = contractEmployeeImpl.calculateTotalCompensation(null);
         assertEquals("calculateTotalCompensation() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
     /**
      * Test calculateTotalCompensation() method
      */
     @Test
     public void TestCalculateTotalCompensation() {
         final double expectValue = 60000;
         double actualValue = contractEmployeeImpl.calculateTotalCompensation(employee);
          assertEquals("calculateTotalCompensation() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
}
