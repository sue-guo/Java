/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;

import java.util.Date;

/**
 * One type of employee ContractEmployee, inherit Employee class
 * @author Hongxiu Guo
 */
public class ContractEmployee extends Employee{
    /** renewalDate 1 year from today*/
    private Date renewalDate;
    /**
     * Constructor with parameter
     * @param name
     * @param email
     * @param salary
     * @param numberOfServiceYear 
     */
    public ContractEmployee(String name, String email,double salary, int numberOfServiceYear) {
        super(name, email, salary, numberOfServiceYear);
    }
    /**
     * Accessor for renewalDate
     * @return 
     */
    public Date getRenewalDate() {
        return renewalDate;
    }
    /**
     * Mutator for renewalDate
     * @param renewalDate 
     */
    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
    
}
