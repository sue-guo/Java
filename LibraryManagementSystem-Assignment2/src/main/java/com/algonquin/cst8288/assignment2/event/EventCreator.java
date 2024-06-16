/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.event;

/**
 * This is superClass of event creator
 * 
 * @author Hongxiu Guo
 */
public abstract class EventCreator {
    
    /**
     *  Common method to create event
     * @param type
     * @param eventName
     * @param description
     * @param activities
     * @return 
     */
    public abstract Event createEvent(EventType type,String eventName ,String description, String activities);
    
}
