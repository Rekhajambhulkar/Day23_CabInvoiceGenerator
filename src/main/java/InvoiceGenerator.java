package com.bridgelabz.invoiceservice;

public class InvoiceGenerator {

    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    private double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    public InvoiceSummary calculateTotalFareFromRepository(int id) {
        firstRider.add(firstRider1);
        firstRider.add(firstRider2);
        firstRider.add(firstRider3);
        secondRider.add(secondRider1);
        secondRider.add(secondRider2);
        secondRider.add(secondRider3);
        thirdRider.add(thirdRider1);
        thirdRider.add(thirdRider2);
        thirdRider.add(thirdRider3);
        repository.put(1100, firstRider);
        repository.put(2200, secondRider);
        repository.put(3300, thirdRider);

        ArrayList<Ride> rides = repository.get(id);
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.size(), totalFare);
    }
}
