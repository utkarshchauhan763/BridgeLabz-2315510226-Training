// Creating Class PowerCalculatorWhile to find power of a number using while loop
import java.util.Scanner;

class PowerCalculatorWhile {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input values for number and power
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        // Check if both are positive integers
        if (number >= 0 && power >= 0) {
            // Initialize result variable and counter
            long result = 1;
            int counter = 0;
            
            // Use while loop to calculate power
            while (counter < power) {
                result *= number;
                counter++; // Increment counter
            }
            
            // Display the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        } else {
            System.out.println("Please enter positive integers.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
