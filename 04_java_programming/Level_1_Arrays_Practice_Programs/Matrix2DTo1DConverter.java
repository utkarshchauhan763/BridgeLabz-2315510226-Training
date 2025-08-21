// Creating Class Matrix2DTo1DConverter to copy 2D array into 1D array
import java.util.Scanner;

class Matrix2DTo1DConverter {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        
        // Create 2D array (Matrix)
        int[][] matrix = new int[rows][columns];
        
        // Take user input for 2D array elements
        System.out.println("Enter elements of the " + rows + "x" + columns + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Display the 2D array
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Create 1D array with size = rows * columns
        int[] array = new int[rows * columns];
        
        // Define index variable for 1D array
        int index = 0;
        
        // Copy elements from 2D array to 1D array using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        
        // Display the 1D array
        System.out.println("\n1D Array (Copied from 2D Array):");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Closing the Scanner Stream
        input.close();
    }
}
