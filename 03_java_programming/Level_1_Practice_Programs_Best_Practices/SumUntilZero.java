// Creating Class SumUntilZero to find sum of numbers until user enters 0
import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Initialize total sum to 0.0
        double total = 0.0;
        double userNumber;
        
        // Get first input from user
        System.out.print("Enter a number (0 to stop): ");
        userNumber = input.nextDouble();
        
        // Use while loop to continue until user enters 0
        while (userNumber != 0) {
            // Add user entered value to total
            total += userNumber;
            
            // Ask user for next input
            System.out.print("Enter a number (0 to stop): ");
            userNumber = input.nextDouble();
        }
        
        // Display the total sum
        System.out.println("The total sum is: " + total);
        
        // Closing the Scanner Stream
        input.close();
    }
}
