package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;

/**
 *
 *  This is a subclass of Event, BookLaunchEvent
 * @author Hongxiu Guo
 */
public class BookLaunchEvent extends AcademicLibraryEvent {

    /**
     * Calculate admissionFee for BookLaunchEvent
     * @return  AdmissionFee
     */
    @Override
    public double calculateAdmissionFee() {
        return Constants.BOOK_LAUNCH_DURATION*Constants.BOOK_LAUNCH_RATE;
    }
    
}
