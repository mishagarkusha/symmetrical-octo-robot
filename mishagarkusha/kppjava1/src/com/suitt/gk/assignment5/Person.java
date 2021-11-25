package com.suitt.gk.assignment5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Person implements ITask1 {
    String surname;
    String name;
    String birthdate;
    int height;
    int weight;

    public Person(String surname, String name, String birthdate, int height, int weight) {
        this.surname = surname;
        this.name = name;
        this.birthdate = birthdate;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void input() {
        System.out.println("Input in Person!");
    }

    @Override
    public void output() {
        System.out.println("Output in Person!");
        System.out.println(this);
    }

    @Override
    public int method() {
        System.out.println("Method in Person! Returns the number of full years that a person has lived");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dt = LocalDate.parse(birthdate, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dt, currentDate);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return height * height;
    }
}
