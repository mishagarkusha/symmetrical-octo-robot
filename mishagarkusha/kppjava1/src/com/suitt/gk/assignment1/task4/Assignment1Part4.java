package com.suitt.gk.assignment1.task4;

import java.util.Scanner;

/**
 * Determine the maximum and minimum value from three different real numbers.
 */
public class Assignment1Part4 {
    public static void main(String[] args) {
        double v1 = readNumber();
        double v2 = readNumber();
        double v3 = readNumber();
        findMaxAndMin(v1, v2, v3);
    }

    private static void findMaxAndMin(double v1, double v2, double v3) {
        System.out.println("Max is " + Math.max(Math.max(v1, v2), v3));
        System.out.println("Min is " + Math.min(Math.min(v1, v2), v3));
    }

    /**
     * Returns entered value from console
     */
    private static double readNumber() {
        System.out.print("Input your number: ");
        return new Scanner(System.in).nextDouble();
    }
}
