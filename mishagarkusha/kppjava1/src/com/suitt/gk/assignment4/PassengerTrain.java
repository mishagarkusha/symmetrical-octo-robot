package com.suitt.gk.assignment4;

import com.suitt.gk.assignment4.utils.Time;


public class PassengerTrain extends Train {
    private int amountOfPassengers;

    @Override
    public Time getTravelTime() {
        return getArrivalTime().subtract(getDepartureTime());
    }

    public PassengerTrain() {
        this.amountOfPassengers = 0;
    }

    public PassengerTrain(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public PassengerTrain(String destination, int trainNumber, Time departureTime, Time arrivalTime, int amountOfPassengers) {
        super(destination, trainNumber, departureTime, arrivalTime);
        this.amountOfPassengers = amountOfPassengers;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString()
                + " PassengerTrain{" +
                "amountOfPassengers=" + amountOfPassengers +
                "}";
    }
}