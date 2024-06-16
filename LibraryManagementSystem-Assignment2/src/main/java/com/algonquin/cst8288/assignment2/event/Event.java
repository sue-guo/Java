package com.algonquin.cst8288.assignment2.event;
/**
 * This is abstract class of event, define common fields for all event 
 * @author Hongxiu Guo
 */
public abstract class Event {
    /**event id */
    private int event_id;
    /** even name*/
    protected String eventName;
    /**event Description */
    protected String eventDescription;
    /**event Activities */
    protected String eventActivities;
    /**admissionFees */
    protected double admissionFees;
    /**
     * Constructor
     */
    public Event() {

    }
    /**
     * Accessor for event id
     * @return event id
     */
    public int getEvent_id() {
        return event_id;
    }

    /**
     * Mutator for event id
     * @param event_id  event id to set
     */
    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }


    /**
     * Accessor for event name
     * @return the eventName
     */
    public String getEventName() {
            return eventName;
    }

    /**
     * Mutator for event name
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
            this.eventName = eventName;
    }

    /** 
     * Accessor for event description
     * @return the eventDescription
     */
    public String getEventDescription() {
            return eventDescription;
    }

    /**
     * Mutator for event description
     * @param eventDescription the eventDescription to set
     */
    public void setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
    }
    /**
     * Accessor for event activities
     * @return the eventActivities
     */
    public String getEventActivities() {
            return eventActivities;
    }

    /**
     * 
     * Mutator for event activities
     * @param eventActivities the eventActivities to set
     */
    public void setEventActivities(String eventActivities) {
            this.eventActivities = eventActivities;
    }

    /**
     * Accessor for admission fees
     * @return the admissionFees
     */
    public double getAdmissionFees() {
            return admissionFees;
    }
    /**
     * Mutator for admission fees
     * @param admissionFees the admissionFees to set
     */
    public void setAdmissionFees(double admissionFees) {
            this.admissionFees = admissionFees;
    }
    // Every library as it own admission fee
    public abstract double calculateAdmissionFee();
        
        
    
    
}
