package com.suitt.gk.assignment1.task2;

import java.util.ArrayList;
import java.util.Scanner;

import static com.suitt.gk.assignment1.Constants.INVALID_INPUT_WRONG_INDEX;

/**
 * An integer is specified that identifies the student number of your group (according to the journal).
 * Display the name of the student according to his number in the journal.
 */
public class Assignment1Part2 {

    private static final Database database = new Database();


    public static void main(String[] args) throws Exception {
        int indexOfStudent = readNumber();
        ArrayList<Student> myGroup = database.getGroupList();
        validateNumber(indexOfStudent, myGroup.size());
        System.out.println(myGroup.get(indexOfStudent));
    }

    /**
     * Returns entered value from console
     */
    private static int readNumber() {
        System.out.print("Input number of student in journal: ");
        return new Scanner(System.in).nextInt() - 1;
    }


    private static void validateNumber(int number, int sizeOfMyGroup) throws Exception {
        if (number < 0 || number >= sizeOfMyGroup) {
            throw new Exception(INVALID_INPUT_WRONG_INDEX);
        }
    }
}
