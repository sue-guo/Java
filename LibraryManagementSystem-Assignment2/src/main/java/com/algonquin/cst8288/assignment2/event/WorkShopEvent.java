package com.algonquin.cst8288.assignment2.event;

import com.algonquin.cst8288.assignment2.constants.Constants;

/**
 * This is a subclass of AcademicLibraryEvent, WorkShopEvent
 * @author Hongxiu Guo
 */
public class WorkShopEvent extends AcademicLibraryEvent{
    /**
     * Calculate admissionFee for WorkShopEvent
     * @return  Admission Fee
     */
    @Override
    public double calculateAdmissionFee() {
        return Constants.WORKSHOP_RATE * Constants.WORKSHOP_DURATION;
    }
    
}
