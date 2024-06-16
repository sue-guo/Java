/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algonquin.cst8288.assignment2.event;


/**
 * This is a creator for public library event, using Factory method
 * @author Hongxiu Guo
 */
public class PublicLibraryEventCreator extends EventCreator {

    /**
     * Creates an event based on the specified type.
     * @param type type of event
     * @param eventName event name
     * @param description description of event
     * @param activities activities of event
     * @return event an instance of KIDS_STORY or MOVIE_NIGHT
     */
    @Override
    public Event createEvent(EventType type,String eventName ,String description, String activities) {
        Event event =null;
        switch(type){
        case KIDS_STORY: 
            System.out.println("creating KIDS_STORY event.....");
            event = new KidsStoryEvent();
            event.setEventName(eventName);
            event.setEventDescription(description);
            event.setEventActivities(activities);
            event.setAdmissionFees(event.calculateAdmissionFee());
            System.out.println("KIDS_STORY event created!");
            break;
        case MOVIE_NIGHT:
            System.out.println("creating MOVIE_NIGHT event.....");
            event = new MovieNightEvent();
            event.setEventName(eventName);
            event.setEventDescription(description);
            event.setEventActivities(activities);
            event.setAdmissionFees(event.calculateAdmissionFee());
            System.out.println("MOVIE_NIGHT event created!"); 
            break;
    }
        return event;
    }
    
}
