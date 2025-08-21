// Creating Class GreatestFactorFor to find greatest factor of a number beside itself using for loop
import java.util.Scanner;

class GreatestFactorFor {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number > 0) {
            // Initialize greatest factor variable
            int greatestFactor = 1;
            
            // Use for loop from (number-1) down to 1
            for (int i = number - 1; i >= 1; i--) {
                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Break the loop as we found the greatest factor
                }
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
