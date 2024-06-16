package com.algonquin.cst8288.assignment2.event;


/**
 *  This is a creator for academic library event, using Factory method
 * 
 * @author Hongxiu Guo
 */
public class AcademicLibraryEventCreator extends EventCreator {

    /**
     * Creates an event based on the specified type.
     * @param type type of event
     * @param eventName event name
     * @param description description of event
     * @param activities activities of event
     * @return event an instance of WORKSHOP or BOOK_LAUNCH
     */
    @Override
    public Event createEvent(EventType type, String eventName ,String description, String activities) {
        Event event =null;
        switch(type){
        case WORKSHOP: 
            System.out.println("creating WORKSHOP event.....");
            event = new WorkShopEvent();
            event.setEventName(eventName);
            event.setEventDescription(description);
            event.setEventActivities(activities);
            event.setAdmissionFees(event.calculateAdmissionFee());
            System.out.println("WORKSHOP event created!");
            break;
            
        case BOOK_LAUNCH:
            System.out.println("creating BookLaunch event.....");
            event = new BookLaunchEvent();
            event.setEventName(eventName);
            event.setEventDescription(description);
            event.setEventActivities(activities);
            event.setAdmissionFees(event.calculateAdmissionFee());
            System.out.println("Book_Launch event created!"); 
            break;
    }
        return event;
    }
    
}
