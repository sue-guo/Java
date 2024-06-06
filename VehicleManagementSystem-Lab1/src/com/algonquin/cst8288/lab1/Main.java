/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.lab1;

import java.util.Scanner;

/**
 * 
 * Main class to execute the application
 * @author Hongxiu Guo
 */
public class Main {
    /**
    * This is main entrance of the project
    * @param args
    * @throws IOException 
    */
    public static void main(String[] arg){
        
        //Verify:  VehicleManager is a singleton, create multiple object of VehicleManager
        VehicleManager manager1 = VehicleManager.getInstance();
        VehicleManager manager2 = VehicleManager.getInstance();
        VehicleManager manager3 = VehicleManager.getInstance();
        System.out.println("manager1 and manager2 refer to same instance? "+ (manager2 == manager1));
        System.out.println("manager1 and manager3 refer to same instance? "+ (manager3 == manager1));
        
        //Use the factory to create instances of vehicles based on user input
        VehicleFactory factory = new VehicleFactory();
        Scanner input = new Scanner(System.in);
        boolean control = true;
        /*
         *prompt user input, input "car" to build a new car, input "motorcycle" to build a new motorcycle
         *input "exit" to exit project.
        */
        while(control){
            System.out.println("Please input the type of vehicle you want to create(car/motorcycle/exit):");
            String type = input.next();
            if (type.equals("car") || type.equals("motorcycle")){
                Vehicle vehicle = factory.makeVehicle(type);
                manager1.addVehicle(vehicle);
            }else if(type.equals("exit")){
                control = false;
            }else{
                System.out.println("Please input a correct word.");
            }
            
        }
        //display the number of new vehicles
        System.out.println("Total vehicles has been created:"+manager2.getVehicles().size());
       
    }
    
}
