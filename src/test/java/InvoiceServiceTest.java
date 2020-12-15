package com.bridgelabz.invoiceservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    private Assertions Assert;

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnMinimumFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                        new Ride(0.1, 1)
                        };
        double fare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30, fare, 0.0);
    }

    @Test
    public void thisTestWillBePassedWhenIdPassedAndReturnSummaryEquals() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InvoiceSummary summary = invoiceGenerator.calculateTotalFareFromRepository(3300);
        InvoiceSummary expectedSummary = new InvoiceSummary(3, 303.0);
        Assert.assertEquals(expectedSummary, summary);
    }

    @Test
    public void thisTestWillBePassedWhenIdAndTypePassedAndReturnSummaryEquals() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InvoiceSummary summary = invoiceGenerator.calculateTotalFareFromRepositoryAndType(3300, "Premium");
        InvoiceSummary expectedSummary = new InvoiceSummary(3, 466.0);
        Assert.assertEquals(expectedSummary, summary);
    }
}
