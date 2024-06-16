package com.algonquin.cst8288.assignment2.client;

import com.algonquin.cst8288.assignment2.event.Event;
import com.algonquin.cst8288.assignment2.event.EventType;

public class Client {
	
	public static void main(String[] args) {
            
            
            EventBusiness eventBusiness = new EventBusiness();
             /**
             * create 4 type of events, each one insert into DB
             */
            System.out.println("--------------------create events ----------------------");

            Event workShop = eventBusiness.createEvent(EventType.WORKSHOP);
            Event bookLaunch = eventBusiness.createEvent(EventType.BOOK_LAUNCH);
            Event kidsStory = eventBusiness.createEvent(EventType.KIDS_STORY);
            Event movieNight = eventBusiness.createEvent(EventType.MOVIE_NIGHT);
            /**
             * retrieve data from DB by Event_ID
             * 
             */
            System.out.println("--------------------retrieve event ----------------------");
            eventBusiness.retrieveEvent(kidsStory.getEvent_id());
            
            
             /**
             * update an event
             * 
             */
             System.out.println("--------------------update event ----------------------");
             kidsStory.setEventName("Little Kids Stories");
             kidsStory.setEventActivities("share story and sing songs");
             
             eventBusiness.updateEvent(kidsStory);
             eventBusiness.retrieveEvent(kidsStory.getEvent_id());
             
             /**
             * delete an event
             * 
             */
             System.out.println("--------------------delete event ----------------------");
             
             eventBusiness.deleteEvent(movieNight.getEvent_id());
             eventBusiness.retrieveEvent(movieNight.getEvent_id());
             
	}
}
