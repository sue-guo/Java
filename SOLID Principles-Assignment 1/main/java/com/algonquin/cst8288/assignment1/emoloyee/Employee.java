package com.algonquin.cst8288.assignment1.emoloyee;

/**
 * Employee entity class
 * 
 * @author Hongxiu Guo
 */
public class Employee {
        /**employee name*/
	private String name;
        /**employee email*/
	private String email;
        /**employee address*/
	private String address;
        /**employee salary*/
	private double salary;
        /**employee numberOfServiceYear*/
	private int numberOfServiceYear;
        /**employee totalCompensation*/
	private double totalCompensation;
        // Default constructor
	public Employee() {
		
	}
        //Constructor with parameters
	public Employee(String name, String email, double salary, int numberOfServiceYear) {
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.numberOfServiceYear = numberOfServiceYear;
	}
        /**
         * Accessor for employee name
         * @return employee name
         */
	public String getName() {
		return name;
	}
        /**
         * Mutator for employee name
         * @param name 
         */
	public void setName(String name) {
		this.name = name;
	}
        /**
         * Accessor for employee email
         * @return employee email
         */
	public String getEmail() {
		return email;
	}
        /**
         * Mutator for employee email
         * @param email 
         */
	public void setEmail(String email) {
		this.email = email;
	}
        /**
         * Accessor for employee address
         * @return employee address
         */
	public String getAddress() {
		return address;
	}
        /**
         * Mutator for employee address
         * @param address 
         */
	public void setAddress(String address) {
		this.address = address;
	}
        /**
         * Accessor for employee salary
         * @return employee salary
         */
	public double getSalary() {
		return salary;
	}
        /**
         * Mutator for employee salary
         * @param salary 
         */
	public void setSalary(double salary) {
		this.salary = salary;
	}
        /**
         * Accessor for employee numberOfServiceYear
         * @return employee numberOfServiceYear
         */
	public int getNumberOfServiceYear() {
		return numberOfServiceYear;
	}
        /**
         * Mutator for employee numberOfServiceYear
         * @param numberOfServiceYear 
         */
	public void setNumberOfServiceYear(int numberOfServiceYear) {
		this.numberOfServiceYear = numberOfServiceYear;
	}
        /**
         * Accessor for employee totalCompensation
         * @return employee totalCompensation
         */
	public double getTotalCompensation() {
		return totalCompensation;
	}
        /**
         * Mutator for employee totalCompensation
         * @param totalCompensation 
         */
	public void setTotalCompensation(double totalCompensation) {
		this.totalCompensation = totalCompensation;
	}
        /**
         * toString() display the employee information
         * @return 
         */
	@Override
	public String toString() {
		return "(name=" + name + ", email=" + email + ", address=" + address + ", salary=" + salary
				+ ", numberOfServiceYear=" + numberOfServiceYear +  ", totalCompensation="
				+ totalCompensation  + ")";
	}

}