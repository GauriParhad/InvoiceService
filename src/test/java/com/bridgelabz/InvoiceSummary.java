package com.bridgelabz;

public class InvoiceSummary {
    private final int numberOfRides;
    private final double totalmonthlyFare;
    private final double averageFare;

    public InvoiceSummary(int numberOfRides, double totalfare){
        this.numberOfRides= numberOfRides;
        this.totalmonthlyFare=totalfare;
        this.averageFare=this.totalmonthlyFare/this.numberOfRides;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides && Double.compare(that.totalmonthlyFare, totalmonthlyFare) == 0 && Double.compare(that.averageFare, averageFare) == 0;
    }
}
