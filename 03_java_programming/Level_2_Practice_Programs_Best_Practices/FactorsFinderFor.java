// Creating Class FactorsFinderFor to find all factors of a number using for loop
import java.util.Scanner;

class FactorsFinderFor {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            
            // Use for loop to find factors from 1 to number
            for (int i = 1; i <= number; i++) {
                // Check if number is perfectly divisible by i
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // New line after all factors
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
