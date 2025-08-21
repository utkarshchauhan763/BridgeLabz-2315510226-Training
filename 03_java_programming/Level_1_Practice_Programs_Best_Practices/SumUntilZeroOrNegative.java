// Creating Class SumUntilZeroOrNegative to find sum until user enters 0 or negative number
import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Initialize total sum to 0.0
        double total = 0.0;
        double userNumber;
        
        // Use infinite while loop
        while (true) {
            // Get input from user
            System.out.print("Enter a number (0 or negative to stop): ");
            userNumber = input.nextDouble();
            
            // Check if user entered 0 or negative number to break
            if (userNumber <= 0) {
                break;
            }
            
            // Add user entered value to total
            total += userNumber;
        }
        
        // Display the total sum
        System.out.println("The total sum is: " + total);
        
        // Closing the Scanner Stream
        input.close();
    }
}
