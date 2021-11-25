package com.suitt.gk.assignment5;

import java.util.LinkedList;

public class Assignment5Part1 {
    public static void main(String[] args) {
        LinkedList<ITask1> list = new LinkedList<>();
        list.add(createPerson());
        list.add(createState());
        list.add(createRent());

        for (ITask1 item : list) {
            System.out.println("Current item is " + item.getClass().getSimpleName());
            item.input();
            item.output();
            int result = item.method();
            System.out.println("Result of method is " + result);
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
                "01.12.2000",
                180,
                80
        );
    }
}
