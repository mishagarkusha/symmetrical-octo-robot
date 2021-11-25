package com.suitt.gk.assignment1.task3;

import java.util.Scanner;

import static com.suitt.gk.assignment1.Constants.*;

/**
 * Determine whether a third digit of a four-digit number
 * is equal to its first digit, a fourth - to the first.
 */
public class Assignment1Part3 {
    public static void main(String[] args) throws Exception {
        int number = readNumber();
        boolean result = calculateThirdTask(number);
        System.out.println(result
                ? SUCCESSFUL_OPERATION_TEXT_TASK3
                : UNSUCCESSFUL_OPERATION_TEXT_TASK3);
    }

    private static boolean calculateThirdTask(int number) {
        String digits = String.valueOf(number);

        return digits.charAt(2) == digits.charAt(0) &&
                digits.charAt(3) == digits.charAt(0);
    }

    /**
     * Returns entered value from console
     */
    private static int readNumber() throws Exception {
        System.out.print("Input your number: ");
        int number = new Scanner(System.in).nextInt();
        validateNumber(number);
        return number;
    }


    private static void validateNumber(int number) throws Exception {
        if (number <= MAX_THREE_DIGIT_NUMBER) {
            throw new Exception(INVALID_INPUT_TOO_SMALL_ERROR);
        } else if (number >= MIN_FIVE_DIGIT_NUMBER) {
            throw new Exception(INVALID_INPUT_TOO_HIGH_ERROR);
        }
    }
}
