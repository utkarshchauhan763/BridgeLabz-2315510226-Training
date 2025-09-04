package Java_Practices.Label3;

import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random numbers 0–9
            }
        }
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix multiplication not possible: Columns of A must equal rows of B.");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows for first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols for first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows for second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols for second matrix: ");
        int c2 = sc.nextInt();

        int[][] A = generateMatrix(r1, c1);
        int[][] B = generateMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("\nA + B:");
            printMatrix(addMatrices(A, B));

            System.out.println("\nA - B:");
            printMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition and Subtraction not possible (dimension mismatch).");
        }

        if (c1 == r2) {
            System.out.println("\nA x B:");
            printMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible (A's cols != B's rows).");
        }

        sc.close();
    }
}
