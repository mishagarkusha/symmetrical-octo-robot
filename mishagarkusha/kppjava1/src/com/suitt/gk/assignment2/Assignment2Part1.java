package com.suitt.gk.assignment2;

import java.util.Random;
import java.util.Scanner;

/*
Задана матрица A(n,n). Зеркально отразить ее относительно побочной
диагонали. В преобразованной матрице найти столбцы, элементы которых
образуют убывающую последовательность.
 */
public class Assignment2Part1 {
    public static void main(String[] args) {
        System.out.print("Input size of matrix: ");
        int[][] matrix = createMatrix(new Scanner(System.in).nextInt());
        mirrorMatrix(matrix);
        printDescendingSequences(matrix);
    }

    private static void printDescendingSequences(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if(matrix[j - 1][i] > matrix[j][i]) {
                    count++;
                }
            }
            if(count == matrix.length - 1) {
                System.out.println("There is descending sequence in " + (i + 1) + " row");
            }
        }
    }

    private static void mirrorMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][matrix.length - 1 - i];
                matrix[matrix.length - 1 - j][matrix.length - 1 - i] = temp;
            }
        }
        System.out.println("Mirrored array");
        printMatrix(matrix);
    }

    private static int[][] createMatrix(int sizeOfMatrix) {
        Random random = new Random();
        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Array");
        printMatrix(matrix);
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
