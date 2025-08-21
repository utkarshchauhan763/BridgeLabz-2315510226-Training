// Creating Class FizzBuzzFor to implement FizzBuzz game using for loop
import java.util.Scanner;

class FizzBuzzFor {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number > 0) {
            System.out.println("FizzBuzz sequence from 1 to " + number + ":");
            
            // Use for loop to iterate from 1 to number
            for (int i = 1; i <= number; i++) {
                // Check for multiples of both 3 and 5 first
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if not a multiple of 3 or 5
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
