package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;

/**
 * This is a subclass of Event
 * @author Hongxiu Guo
 */
public class MovieNightEvent extends PublicLibraryEvent {

    /**
     * Calculate admissionFee for MovieNightEvent
     * @return  Admission Fee
     */
    @Override
    public double calculateAdmissionFee() {
        return Constants.MOVIE_NIGHT_DURATION * Constants.MOVIE_NIGHT_RATE;
    }
    
}
