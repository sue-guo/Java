/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Calendar;
import java.util.Date;

/**
 * Concrete class implement ContractEmployeeService and EmployeeService interface
 * @author Hongxiu Guo
 */
public class ContractEmployeeImpl implements ContractEmployeeService, EmployeeService {
    /**
     * Calculate renewDate for ContractEmployee
     * @return  the day 1 year from today
     */
    @Override
    public Date renewalDate() {
        Date nowDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        
        // Add one year to the calendar
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR)+ 1);
        // Convert the calendar back to a Date object
        Date oneYearLate = calendar.getTime();

        return oneYearLate;
    }
    /**
     * calculate totalCompensation for ContractEmployee
     * @param employee
     * @return totalCompensation
     */
    @Override
    public double calculateTotalCompensation(Employee employee) {
        return employee == null? 0.0 : employee.getSalary();
    }

}
