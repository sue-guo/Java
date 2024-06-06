package com.algonquin.cst8288.assignment1.controller;


import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.persistence.Formatter;
import java.io.IOException;

/**
 * 
 * Process employee data.
 * @author Hongxiu Guo 
 */

public class EmployeeController {
    
    private EmployeeValidation validator;
    private PersistenceService service;

    /**
     * Constructor with validator and persistenceService
     * 
     * @param validator
     * @param service 
     */
    public EmployeeController(EmployeeValidation validator, PersistenceService service) {
        this.validator = validator;
        this.service = service;
    }
    /**
     * process employee, validate employee, save employee in file, and display employ in output 
     * 
     * @param employee
     * @param fileName
     * @param formatter
     * @return message
     * @throws IOException 
     */
    public String processEmployee(Employee employee, String fileName, Formatter formatter) throws IOException {

            // Validate data
            if (!validator.isValidEmployee(employee)) {
                    return "FALIED";
            }
            // Store data
            service.saveEmployee(employee, fileName, formatter);
            //display data
            service.displayEmployee(employee,formatter);
            
            return "SUCCESS";
    }

}