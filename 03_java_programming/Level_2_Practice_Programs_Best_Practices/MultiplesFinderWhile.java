// Creating Class MultiplesFinderWhile to find all multiples of a number below 100 using while loop
import java.util.Scanner;

class MultiplesFinderWhile {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();
        
        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            
            // Initialize counter for while loop
            int counter = 99;
            
            // Use while loop from 99 down to 1
            while (counter >= 1) {
                // Check if counter is a multiple of number
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                
                // Decrement counter
                counter--;
            }
            System.out.println(); // New line after all multiples
        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
