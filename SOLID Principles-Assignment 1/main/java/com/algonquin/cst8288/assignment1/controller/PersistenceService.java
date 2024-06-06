/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.controller;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * save employee data.
 * 
 * @author Hongxiu Guo
 */
public class PersistenceService {
    
    
   /**
    * Write data into file it obey DIP, dependent on interface Formatter
    * @param person
    * @param filename
    * @param formatter
    * @throws IOException 
    */
   public void saveEmployee(Employee person, String filename, Formatter formatter) throws IOException {
        
           try (PrintWriter writer = new PrintWriter(new FileWriter(filename,true))) {
                   writer.println(formatter.format(person));
                   
                   writer.flush();
           }
   }
   /**
    * Display the data to the Console
    * @param employee
    * @param formatter
    * @throws IOException 
    */
    public void displayEmployee(Employee employee, Formatter formatter) throws IOException {
        
        System.out.println( formatter.format(employee));
      
    }
   
           
}
