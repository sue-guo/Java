/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment1.persistence;

import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployee;
import com.algonquin.cst8288.assignment1.emoloyee.Employee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployee;
import java.io.IOException;

/**
 *An implementation for formatting the data in key-value pairs format.
 * @author Hongxiu Guo
 */
public class TextFormatter implements Formatter{
    /**
    * The method process the employee object and extract the attributes 
    * key= value pair format.
    * 
     * @param employee
     * @return  formatted string
     * @throws java.io.IOException
    */
    @Override
    public String format(Employee employee) throws IOException {
       
        String s = "(name=" + employee.getName()+ ", email=" + employee.getEmail() + ", address=" + employee.getAddress()
                + ", salary=" + employee.getSalary() + ", numberOfServiceYear=" + employee.getNumberOfServiceYear() 
                +  ", totalCompensation=" + employee.getTotalCompensation() ;
        
        if(employee instanceof PermanentEmployee){
            PermanentEmployee permanentEmployee = (PermanentEmployee)employee;
            s += ", bonus=" + permanentEmployee.getBonus()+ ", pension=" + permanentEmployee.getPension();
        }else if(employee instanceof ContractEmployee){
            ContractEmployee contractEmployee = (ContractEmployee)employee;
            s += ", renewalDate="+ contractEmployee.getRenewalDate();
        }
        
        s += ")";
        
       return s;
    }
    
}
