/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import com.algonquin.cst8288.assignment1.controller.Rate;

/**
 *Concrete class implement PermanentEmployeeService and EmployeeService interface
 * @author hxiug
 */
public class PermanentEmployeeImpl implements PermanentEmployeeService, EmployeeService{

    /**
     * This method to calculate the pension
     * @param employee
     * @return  Pension
     */
    @Override
    public double pensionContribution(Employee employee) {
        double pension = employee == null? 0.0 : employee.getSalary()* Rate.PENSION_PERCENTAGE;
        return pension;
    }

    /**
     * This method to calculate the bonus
     * @param employee
     * @return Bonus
     */
    @Override
    public double calculateBonus(Employee employee) {
        return employee == null? 0.0 : employee.getSalary() * employee.getNumberOfServiceYear()* Rate.BONUS_PERCENTAGE;
    }

    /**
     * This method to calculate the total compensation: salary + bonus
     * @param employee
     * @return TotalCompensation
     */
    @Override
    public double calculateTotalCompensation(Employee employee) {
         return employee == null? 0.0 : employee.getSalary()+ calculateBonus(employee);
    }
    
    
    
}
