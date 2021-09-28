package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    InvoiceService invoiceGenerator=null;

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceService invoiceService = new InvoiceService();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceService.calculateFare(distance, time);
        Assertions.assertEquals(25, fare);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturnMinFare() {
        InvoiceService invoiceService = new InvoiceService();
        double distance = 0.2;
        int time = 1;
        double fare = invoiceService.calculateFare(distance, time);
        Assertions.assertEquals(5, fare);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        InvoiceService invoiceService = new InvoiceService();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.2, 1)
        };

        InvoiceSummary summary= invoiceService.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2,30);
        Assertions.assertEquals(expectedInvoiceSummary,summary);
    }
    @Test
    public void giverUserIdAndRides_ShouldReturnInvoiceSummary(InvoiceService invoiceService) {
        String userId = "abc@xyz.com";
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.2, 1)
        };

        invoiceService.addRide(userId,rides);
        InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
        Assertions.assertEquals(expectedInvoiceSummary, summary);

    }

}
