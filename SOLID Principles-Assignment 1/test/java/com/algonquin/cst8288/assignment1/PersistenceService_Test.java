/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.algonquin.cst8288.assignment1;

import com.algonquin.cst8288.assignment1.controller.PersistenceService;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test PersistenceService class
 * @author hxiug
 */
public class PersistenceService_Test {
    private PersistenceService persistService;
    public PersistenceService_Test() {
    }
    
    @Before
    public void setUp() {
        persistService = new PersistenceService();
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Verify that file is saved
     * @throws IOException 
     */
     @Test
     public void VerifyEmployeeSaved() throws IOException {
         Employee employee = new Employee("Sue Guo","ssjj@gamil.com",60000,3);
         String filePath = "c:\\temp\\employeeFile.txt";
         persistService.saveEmployee(employee, filePath, new JSONFormatter());
         
         File f = new File(filePath);
         assertTrue("File NOt exist!", f.exists());
         
     }
     
     
    
    
}
