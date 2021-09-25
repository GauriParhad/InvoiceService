package com.bridgelabz;

public class InvoiceGenerator {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final double COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double TotalFare= distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        if(TotalFare<MINIMUM_FARE)
            return MINIMUM_FARE;
        return TotalFare;

    }
}
