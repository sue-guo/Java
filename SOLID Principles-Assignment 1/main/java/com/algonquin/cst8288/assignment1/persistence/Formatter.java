package com.algonquin.cst8288.assignment1.persistence;

import java.io.IOException;

import com.algonquin.cst8288.assignment1.emoloyee.Employee;

/**
 * This is interface, declare a format method
 * @author Hongxiu Guo
 */
public interface Formatter {
	
	public String format(Employee employee) throws IOException;
	
}

