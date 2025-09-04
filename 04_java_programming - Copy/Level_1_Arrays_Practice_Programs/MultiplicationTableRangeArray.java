// Creating Class MultiplicationTableRange to create multiplication table from 6 to 9 using arrays
import java.util.Scanner;

class MultiplicationTableRangeArray {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Define an integer array to store multiplication results from 6 to 9
        int[] multiplicationResult = new int[4]; // Array of size 4 for indices 6,7,8,9
        
        // Use for loop to calculate multiplication from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store at index (i-6)
        }
        
        // Display the multiplication table from the array
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6; // Convert index back to multiplier (6,7,8,9)
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
