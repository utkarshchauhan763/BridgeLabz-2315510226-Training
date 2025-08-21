// Creating Class FactorsFinderWhile to find all factors of a number using while loop
import java.util.Scanner;

class FactorsFinderWhile {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            
            // Initialize counter for while loop
            int counter = 1;
            
            // Use while loop to find factors from 1 to number
            while (counter <= number) {
                // Check if number is perfectly divisible by counter
                if (number % counter == 0) {
                    System.out.print(counter + " ");
                }
                
                // Increment counter
                counter++;
            }
            System.out.println(); // New line after all factors
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
