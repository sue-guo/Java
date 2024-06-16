package com.algonquin.cst8288.assignment2.client;

import com.algonquin.cst8288.assignment2.database.DBOperations;
import com.algonquin.cst8288.assignment2.event.AcademicLibraryEventCreator;
import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventCreator;
import com.algonquin.cst8288.assignment2.event.EventType;
import com.algonquin.cst8288.assignment2.event.PublicLibraryEventCreator;

/**
 * This class handle operations of event
 * @author Hongxiu Guo
 */
public class EventBusiness {
    /**
     * create an event and insert into database
     * @param type even type
     * @return an instance of event
     */
    public Event createEvent(EventType type){
         Event event = null;
         EventCreator creator1 = new AcademicLibraryEventCreator(); 
         EventCreator creator2 = new PublicLibraryEventCreator();
         switch(type){
             case WORKSHOP:
                 event = creator1.createEvent(type,"Build a Little Train","This is a free activity","build a train");
                 break;
             case BOOK_LAUNCH:
                 event = creator1.createEvent(type,"Launch New Book ","anthor: xxx. date: 2024.05.06","introduce new book");
                 break;
             case KIDS_STORY:
                 event = creator2.createEvent(type,"Kids Stories","Activity suit for kids under 6","share story");
                 break;
             case MOVIE_NIGHT:
                 event = creator2.createEvent(type, "Outdoor Movie Night",
                    "This special event is perfect for families, friends, and movie enthusiasts of all ages","Movie Screening and Firework");
                 break;
              default:
                    throw new IllegalArgumentException("Unknown event type: " + type);
         }
         if(event != null ){
               // insert into database then return id, set the id into event
            event.setEvent_id(DBOperations.createEvent(event));
         }
        return event;
    }

    /**
     * retrieveEvent 
     * @param event_id event id
     */
    public void retrieveEvent(int event_id) {
        
        DBOperations.retrieveEvent(event_id);
    }

    /**
     * updateEvent 
     * @param kidsStory event
     */
    public void updateEvent(Event event) {
        DBOperations.updateEvent(event);
    }

    /**
     * deleteEvent 
     * @param event_id event id
     */
    public void deleteEvent(int event_id) {
        DBOperations.deleteEvent(event_id);
    }
    
}
