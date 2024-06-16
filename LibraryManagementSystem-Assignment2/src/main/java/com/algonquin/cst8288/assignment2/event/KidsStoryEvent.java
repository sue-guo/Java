package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;


/**
 * This is a subclass of Event, KidsStoryEvent
 * @author Hongxiu Guo
 */
public class KidsStoryEvent extends PublicLibraryEvent {

    /**
     * Calculate admissionFee for KidsStoryEvent
     * @return Admission Fee
     */
    @Override
    public double calculateAdmissionFee() {
        return Constants.KIDS_STORYTIME_DURATION * Constants.KIDS_STORYTIME_RATE;
    }
    
}
