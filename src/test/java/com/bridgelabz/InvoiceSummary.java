package com.bridgelabz;

public class InvoiceSummary {
    private final int numberOfRides;
    private final double totalMonthlyFare;
    private final double averageFare;

    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalMonthlyFare = totalFare;
        this.averageFare = this.totalMonthlyFare / this.numberOfRides;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides && Double.compare(that.totalMonthlyFare, totalMonthlyFare) == 0 && Double.compare(that.averageFare, averageFare) == 0;
    }
}
