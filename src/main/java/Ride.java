package com.bridgelabz.invoiceservice;

import org.junit.Test;

public class Ride {
    public double distance;
    public final int time;

    public double getDistance() {
       return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }
}
