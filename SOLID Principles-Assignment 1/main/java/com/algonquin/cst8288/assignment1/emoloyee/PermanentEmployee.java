/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.emoloyee;


/**
 *One type of employee PermanentEmployee, inherit Employee class
 * @author Hongxiu Guo
 */
public class PermanentEmployee extends Employee{
    /**bonus*/
    private double bonus;
    /**pension*/
    private double pension;
    /**
     * Constructor with parameters
     * @param name
     * @param email
     * @param salary
     * @param numberOfServiceYear 
     */
    public PermanentEmployee(String name,String email, double salary, int numberOfServiceYear) {
        super(name, email, salary,numberOfServiceYear);
    }
    /**
     * Accessor for bonus
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }
    /**
     * Mutator for bonus
     * @param bonus 
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * Accessor for pension
     * @return pension
     */
    public double getPension() {
        return pension;
    }

    /**
     *  Mutator for pension
     * @param pension 
     */
    public void setPension(double pension) {
        this.pension = pension;
    }
    
    
}
