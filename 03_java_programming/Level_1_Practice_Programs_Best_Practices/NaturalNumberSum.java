// Creating Class NaturalNumberSum to check natural number and find sum of n natural numbers
import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is a natural number (positive integer)
        if (number > 0) {
            // Calculate sum of n natural numbers using formula
            int sumOfNaturalNumbers = number * (number + 1) / 2;
            
            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            // Print if not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
