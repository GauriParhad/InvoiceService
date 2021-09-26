package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator=null;

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.2;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
        new Ride(0.2, 1) };

        double fare = invoiceGenerator.calculatetotalfare(rides);
        Assertions.assertEquals(30,fare, 0.0);
    }
}
