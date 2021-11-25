package com.suitt.gk.assignment5;

public class Rent implements ITask1 {
    String apartmentAddress;
    int amountOfRooms;
    int overallSize;
    int costPerDay;

    public Rent(String apartmentAddress, int amountOfRooms, int overallSize, int costPerDay) {
        this.apartmentAddress = apartmentAddress;
        this.amountOfRooms = amountOfRooms;
        this.overallSize = overallSize;
        this.costPerDay = costPerDay;
    }

    @Override
    public void input() {
        System.out.println("Input in Rent!");
    }

    @Override
    public void output() {
        System.out.println("Output in Rent!");
        System.out.println(this);
    }

    /**
     * @return cost of rent of 1 square meter
     */
    @Override
    public int method() {
        System.out.println("Method in Rent! Returns cost of rent of 1 square meter");
        return costPerDay / overallSize;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "apartmentAddress='" + apartmentAddress + '\'' +
                ", amountOfRooms=" + amountOfRooms +
                ", overallSize=" + overallSize +
                ", costPerDay=" + costPerDay +
                '}';
    }

    @Override
    public int hashCode() {
        return costPerDay * costPerDay;
    }
}
