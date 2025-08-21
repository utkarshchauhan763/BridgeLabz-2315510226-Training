// Creating Class MultiplicationTableArray to create multiplication table using arrays
import java.util.Scanner;

class MultiplicationTableArray {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Define an integer array to store multiplication results from 1 to 10
        int[] multiplicationTable = new int[10];
        
        // Run a loop from 1 to 10 and store results in array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i; // Store at index (i-1)
        }
        
        // Display the multiplication table from the array
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
