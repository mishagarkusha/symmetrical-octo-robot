package com.suitt.gk.assignment1.task1;

import java.util.Scanner;

import static com.suitt.gk.assignment1.Constants.*;

/**
 * Determine if the sum of the first four digits of a given number is greater than 100
 */
public class Assignment1Part1 {

    public static void main(String[] args) throws Exception {
        int number = readNumber();
        System.out.println(isSumOfGivenNumberGreaterThan100(number)
                ? SUCCESSFUL_OPERATION_TEXT_TASK1
                : UNSUCCESSFUL_OPERATION_TEXT_TASK1);
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
        }
    }


    /**
     * Determine if the sum of the first four digits of a given number is greater than 100
     *
     * @return true if sum of the first four digits of a given number is greater than 100,
     * otherwise false
     */
    private static boolean isSumOfGivenNumberGreaterThan100(int number) {
        String stringOfDigits = String.valueOf(number);

        int sumOfCubesOfDigits = 0;
        for (int i = 0; i < NUMBER_MIN_SIZE; i++) {
            sumOfCubesOfDigits += getCubeOfNumber(stringOfDigits.charAt(i));
        }

        return sumOfCubesOfDigits > SUM_OF_CUBE_OF_DIGITS_LOWER_LIMIT;
    }

    /**
     * Returns cube of given number
     *
     * @param number - the number to be raised to the third power
     * @return cube of given number
     */
    private static double getCubeOfNumber(char number) {
        return Math.pow(Integer.parseInt(String.valueOf(number)), 3);
    }
}
