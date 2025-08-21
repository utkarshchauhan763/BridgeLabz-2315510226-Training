// Creating Class FactorialWhile to find factorial of a number using while loop
import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if user entered a positive integer
        if (number >= 0) {
            // Initialize factorial variable and counter
            long factorial = 1;
            int counter = 1;
            
            // Calculate factorial using while loop
            while (counter <= number) {
                factorial *= counter;
                counter++;
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
