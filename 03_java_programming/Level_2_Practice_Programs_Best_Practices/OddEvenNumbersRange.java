// Creating Class OddEvenNumbersRange to print odd and even numbers from 1 to user entered number
import java.util.Scanner;

class OddEvenNumbersRange {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        // Check if number is a natural number
        if (number > 0) {
            System.out.println("Numbers from 1 to " + number + ":");
            
            // Use for loop to iterate from 1 to number
            for (int i = 1; i <= number; i++) {
                // Check if current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
