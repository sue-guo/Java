package com.algonquin.cst8288.assignment1.controller;


import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployee;
import com.algonquin.cst8288.assignment1.emoloyee.ContractEmployeeImpl;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployee;
import com.algonquin.cst8288.assignment1.emoloyee.PermanentEmployeeImpl;
import com.algonquin.cst8288.assignment1.persistence.JSONFormatter;
import com.algonquin.cst8288.assignment1.persistence.TextFormatter;
import java.io.IOException;

/**
 * 
 * Main class to execute the application
 * 
 */

public class Main {
	
	/**
         * This is main entrance of the project
         * @param args
         * @throws IOException 
         */
	public static void main(String[] args) throws IOException {
		

		// Instantiate two Employee objects and use PermanentEmployeeService.java 
		// and ContractEmployeeService.java to calculate and populate required data for objects
		// Utilize EmployeeController.java to save both objects in JSON and Text formats, 
		// saving the data in files named json_employee_data.txt and text_employee_data.txt.
		// Do the same thing to output the data to the console instead of saving it to a file.
                
                //Instantiate ContractEmployee 
                ContractEmployee contract = new ContractEmployee("Mike","111@gmail.com",120000,5);  
                //populate data for contractEmployee
                ContractEmployeeImpl contractorService = new ContractEmployeeImpl();
                contract.setTotalCompensation(contractorService.calculateTotalCompensation(contract));
                contract.setRenewalDate(contractorService.renewalDate());
                
                //Instantiate PermanentEmployee 
                PermanentEmployee permenent = new PermanentEmployee("Mike","111@gmail.com",120000,5);
                //populate data for permanentEmployee
                PermanentEmployeeImpl permenentService = new PermanentEmployeeImpl();
                permenent.setBonus(permenentService.calculateBonus(permenent));
                permenent.setTotalCompensation(permenentService.calculateTotalCompensation(permenent));
                permenent.setPension(permenentService.pensionContribution(permenent));
                
                //process the two employees： save and display
                EmployeeController controller = new EmployeeController(new EmployeeValidation(), new PersistenceService() );
                JSONFormatter  jsonFormatter = new JSONFormatter();
                TextFormatter textFormatter= new TextFormatter();
                
                controller.processEmployee(contract, "json_employee_data.txt" ,jsonFormatter);
                controller.processEmployee(contract, "text_employee_data.txt" ,textFormatter);
                
                controller.processEmployee(permenent, "json_employee_data.txt" ,jsonFormatter);
                controller.processEmployee(permenent, "text_employee_data.txt" ,textFormatter);
		
	}	

}
