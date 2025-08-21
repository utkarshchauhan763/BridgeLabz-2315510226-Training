// Creating Class OddEvenArraySeparator to separate odd and even numbers into different arrays
import java.util.Scanner;

class OddEvenArraySeparator {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            input.close();
            return;
        }
        
        // Create arrays for odd and even numbers with size = number/2 + 1
        int arraySize = number / 2 + 1;
        int[] oddNumbers = new int[arraySize];
        int[] evenNumbers = new int[arraySize];
        
        // Create index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;
        
        // Use for loop to iterate from 1 to number
        for (int i = 1; i <= number; i++) {
            // Check if number is odd or even and store in corresponding array
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Print odd numbers array
        System.out.println("Odd numbers from 1 to " + number + ":");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        
        // Print even numbers array
        System.out.println("Even numbers from 1 to " + number + ":");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        
        // Closing the Scanner Stream
        input.close();
    }
}
