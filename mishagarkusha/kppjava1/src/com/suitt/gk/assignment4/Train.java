package com.suitt.gk.assignment4;


import com.suitt.gk.assignment4.utils.Time;

public abstract class Train {
    private String destination;
    private int trainNumber;
    private Time departureTime;
    private Time arrivalTime;

    public Train() {
        this.destination = "";
        this.trainNumber = 0;
        this.departureTime = new Time();
        this.arrivalTime = new Time();
    }

    public Train(String destination, int trainNumber, Time departureTime, Time arrivalTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public abstract Time getTravelTime();

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
