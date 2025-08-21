// Creating Class PowerCalculatorFor to find power of a number using for loop
import java.util.Scanner;

class PowerCalculatorFor {
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
            // Initialize result variable
            long result = 1;
            
            // Use for loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= number;
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
