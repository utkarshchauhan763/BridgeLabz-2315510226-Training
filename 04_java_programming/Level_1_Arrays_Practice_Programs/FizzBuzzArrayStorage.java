// Creating Class FizzBuzzArrayStorage to implement FizzBuzz and store results in array
import java.util.Scanner;

class FizzBuzzArrayStorage {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }
        
        // Create a String array to save the FizzBuzz results
        String[] fizzBuzzResults = new String[number + 1]; // Size = number + 1 to include 0 to number
        
        // Loop from 0 to number and apply FizzBuzz logic
        for (int i = 0; i <= number; i++) {
            // Check for multiples of both 3 and 5 first
            if (i != 0 && i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            }
            // Check for multiples of 3
            else if (i != 0 && i % 3 == 0) {
                fizzBuzzResults[i] = "Fizz";
            }
            // Check for multiples of 5
            else if (i != 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "Buzz";
            }
            // Store the number as string if not a multiple of 3 or 5
            else {
                fizzBuzzResults[i] = String.valueOf(i);
            }
        }
        
        // Display the results with position information
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i < fizzBuzzResults.length; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
