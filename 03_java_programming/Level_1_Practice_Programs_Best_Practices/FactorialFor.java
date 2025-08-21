// Creating Class FactorialFor to find factorial of a number using for loop
import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if user entered a positive integer
        if (number >= 0) {
            // Initialize factorial variable
            long factorial = 1;
            
            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            // Print the factorial result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
