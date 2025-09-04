// Creating Class FactorsArrayStorage to find and store factors of a number in an array
import java.util.Scanner;

class FactorsArrayStorage {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            input.close();
            return;
        }
        
        // Initialize variables for dynamic array management
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Loop through numbers from 1 to number to find factors
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of number
            if (number % i == 0) {
                // If array is full, expand it
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2; // Double the size
                    int[] temp = new int[maxFactor];
                    
                    // Copy existing elements to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    
                    // Assign new array to factors
                    factors = temp;
                }
                
                // Add factor to array and increment index
                factors[index] = i;
                index++;
            }
        }
        
        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        System.out.println("Total number of factors: " + index);
        
        // Closing the Scanner Stream
        input.close();
    }
}
