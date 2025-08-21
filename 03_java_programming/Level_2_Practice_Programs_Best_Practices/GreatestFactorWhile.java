// Creating Class GreatestFactorWhile to find greatest factor of a number beside itself using while loop
import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number > 0) {
            // Initialize greatest factor variable and counter
            int greatestFactor = 1;
            int counter = number - 1;
            
            // Use while loop from (number-1) down to 1
            while (counter >= 1) {
                // Check if number is perfectly divisible by counter
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; // Break the loop as we found the greatest factor
                }
                
                // Decrement counter
                counter--;
            }
            
            // Display the greatest factor
            System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
