package com.suitt.gk.assignment5;

import java.util.LinkedList;

public class Assignment5Part2 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(createPerson());
        list.add(createState());
        list.add(createRent());

        Long longNumber = 10000L;
        Short shortNumber = 10;
        Byte byteNumber = 124;

        list.add(longNumber);
        list.add(shortNumber);
        list.add(byteNumber);

        for (Object item : list) {
            System.out.println("Current item is " + item.getClass().getSimpleName());
            System.out.println("Hash code is " + item.hashCode());
            System.out.println("toString is " + item);
            System.out.println();
        }
    }

    private static Rent createRent() {
        return new Rent(
                "Address",
                4,
                100,
                500
        );
    }

    private static State createState() {
        return new State(
                "Country",
                "London",
                1_000_000,
                5000
        );
    }

    private static Person createPerson() {
        return new Person(
                "Krabs",
                "Eugene",
                "01.01.2000",
                180,
                80
        );
    }
}
