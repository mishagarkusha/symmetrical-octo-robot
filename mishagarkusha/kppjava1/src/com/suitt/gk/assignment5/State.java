package com.suitt.gk.assignment5;

public class State implements ITask1 {
    String countryName;
    String capital;
    int amountOfCitizens;
    int landArea;

    public State(String countryName, String capital, int amountOfCitizens, int landArea) {
        this.countryName = countryName;
        this.capital = capital;
        this.amountOfCitizens = amountOfCitizens;
        this.landArea = landArea;
    }

    @Override
    public void input() {
        System.out.println("Input in State!");
    }

    @Override
    public void output() {
        System.out.println("Output in State!");
        System.out.println(this);
    }

    @Override
    public int method() {
        System.out.println("Method in State! Returns average population density");
        return amountOfCitizens / landArea;
    }

    @Override
    public String toString() {
        return "State{" +
                "countryName='" + countryName + '\'' +
                ", capital='" + capital + '\'' +
                ", amountOfCitizens=" + amountOfCitizens +
                ", landArea=" + landArea +
                '}';
    }

    @Override
    public int hashCode() {
        return landArea * landArea;
    }
}
