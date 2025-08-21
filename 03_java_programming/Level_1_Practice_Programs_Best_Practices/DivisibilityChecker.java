// Creating Class DivisibilityChecker to check if a number is divisible by 5
import java.util.Scanner;

class DivisibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is divisible by 5
        boolean isDivisibleBy5 = (number % 5 == 0);
        
        // Print the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleBy5);
        
        // Closing the Scanner Stream
        input.close();
    }
}
