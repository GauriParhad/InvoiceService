package com.bridgelabz;

import java.util.Arrays;

public class InvoiceService {
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final double COST_PER_TIME = 1;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double TotalFare= distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        if(TotalFare<MINIMUM_FARE)
            return MINIMUM_FARE;
        return TotalFare;
    }

   private final RideRepository rideRepository = new RideRepository();


    public InvoiceSummary calculateFare(Ride[] rides) {
            double totalFare = Arrays.stream(rides)
                    .mapToDouble(ride -> calculateFare(ride.distance, ride.time))
                    .sum();
        return new InvoiceSummary(rides.length, totalFare);
    }

    public void addRide(String userId, Ride[] rides) {
        rideRepository.addRide(userId,rides);
    }


    public InvoiceSummary getInvoiceSummary(String userId) {
        Ride[] rides = rideRepository.getList(userId);
        return this.calculateFare(rides);
    }

}

