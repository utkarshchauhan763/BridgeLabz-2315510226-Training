// Creating Class FizzBuzzWhile to implement FizzBuzz game using while loop
import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a positive integer
        if (number > 0) {
            System.out.println("FizzBuzz sequence from 1 to " + number + ":");
            
            // Initialize counter for while loop
            int counter = 1;
            
            // Use while loop to iterate from 1 to number
            while (counter <= number) {
                // Check for multiples of both 3 and 5 first
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Print the number if not a multiple of 3 or 5
                else {
                    System.out.println(counter);
                }
                
                // Increment counter
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
