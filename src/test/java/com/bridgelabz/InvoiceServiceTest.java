package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance =2.0;
        int time =5;
        double fare= invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(25,fare);
    }

    @Test
    public void givenLessDistanceOrTime_ShouldReturMinFare(){
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance =0.2;
        int time =1;
        double fare= invoiceGenerator.calculateFare(distance,time);
        Assertions.assertEquals(5,fare);
    }
}
