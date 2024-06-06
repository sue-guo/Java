/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test PermanentEmployeeImpl class
 * @author Hongxiu Guo 
 */
public class PermanentEmployeeImpl_Test {
    
    private PermanentEmployeeImpl permanentEmployeeImpl;
    private Employee employee;
    private final double DELTA = 0.001;
    
    
    @Before
    public void setUp() {
        permanentEmployeeImpl = new PermanentEmployeeImpl();
        employee = new Employee("Lei", "lchen@gmail", 5000, 5);
    }
    
    @After
    public void tearDown() {
        permanentEmployeeImpl = null;
        employee = null;
    }
    /**
     * Test pensionContribution() method with employee date
     */
     @Test
     public void TestPensionContribution() {
         final double expectValue = 50;
         double actualValue = permanentEmployeeImpl.pensionContribution(employee);
         assertEquals("pensionContribution() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
     /**
     * Test pensionContribution() method with employee is null
     */
     @Test
     public void TestPensionContributionWithNull() {
         final double expectValue = 0.0;
         double actualValue = permanentEmployeeImpl.pensionContribution(null);
          assertEquals("pensionContribution() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
     /**
     * Test calculateBonus() method with employee date
     */
     @Test
     public void TestCalculateBonus() {
         final double expectValue = 625;
         double actualValue = permanentEmployeeImpl.calculateBonus(employee);
         assertEquals("calculateBonus() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
     /**
     * Test pensionContribution() method with invalid parameter  
     */
     @Test
     public void TestCalculateBonusWithNull() {
         final double expectValue = 0.0;
         double actualValue = permanentEmployeeImpl.calculateBonus(null);
         assertEquals("calculateBonus() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
    
     /**
     * Test calculateTotalCompensation() method with invalid parameter 
     */
     @Test
     public void TestCalculateTotalCompensationWithNull() {
         final double expectValue = 0.0;
         double actualValue = permanentEmployeeImpl.calculateTotalCompensation(null);
         assertEquals("calculateTotalCompensation() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
     /**
     * Test calculateTotalCompensation() method with employee date
     */
     @Test
     public void TestCalculateTotalCompensation() {
         final double expectValue = 5625;
         double actualValue = permanentEmployeeImpl.calculateTotalCompensation(employee);
          assertEquals("calculateTotalCompensation() return value does not match the expectations",expectValue, actualValue, DELTA);
         
     }
}
