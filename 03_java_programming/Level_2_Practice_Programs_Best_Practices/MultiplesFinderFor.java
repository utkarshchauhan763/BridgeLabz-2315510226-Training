// Creating Class MultiplesFinderFor to find all multiples of a number below 100 using for loop
import java.util.Scanner;

class MultiplesFinderFor {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number less than 100: ");
        int number = input.nextInt();
        
        // Check if number is positive and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100 are:");
            
            // Use for loop backward from 99 to 1
            for (int i = 99; i >= 1; i--) {
                // Check if i is a multiple of number
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); // New line after all multiples
        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
