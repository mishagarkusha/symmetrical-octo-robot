package com.suitt.gk.assignment1.task5;

import java.util.Scanner;

import static com.suitt.gk.assignment1.Constants.SUCCESSFUL_OPERATION_TEXT_TASK5;
import static com.suitt.gk.assignment1.Constants.UNSUCCESSFUL_OPERATION_TEXT_TASK5;

/**
 * A natural number is specified.
 * Is it true that the number "a" appears in it more "k" times.
 */
public class Assignment1Part5 {
    public static void main(String[] args) {
        int a = readNumber("Input NATURAL number: ");
        int k = readNumber("Input k number: ");
        int number = readNumber("Input your number: ");
        boolean result = calculateFifthTask(number, a, k);
        System.out.println(result
                ? SUCCESSFUL_OPERATION_TEXT_TASK5
                : UNSUCCESSFUL_OPERATION_TEXT_TASK5);
    }

    private static boolean calculateFifthTask(int number, int a, int k) {
        String digits = String.valueOf(number);
        int amountOfAppearingNaturalNumber = 0;
        for (int i = 0; i < digits.length(); i++) {
            if (Character.isDigit(digits.charAt(i)) &&
                    Integer.parseInt(String.valueOf(digits.charAt(i))) == a) {
                amountOfAppearingNaturalNumber++;
            }
        }
        return amountOfAppearingNaturalNumber > k;
    }

    /**
     * Returns entered value from console
     */
    private static int readNumber(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
}
