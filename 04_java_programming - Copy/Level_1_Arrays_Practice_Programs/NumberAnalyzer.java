// Creating Class NumberAnalyzer to analyze 5 numbers for positive/negative, even/odd, and compare first/last
import java.util.Scanner;

class NumberAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        
        // Get user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        // Loop through the array and analyze each number
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            
            // Check if number is positive, negative, or zero
            if (number > 0) {
                // For positive numbers, check if even or odd
                if (number % 2 == 0) {
                    System.out.println("Number " + number + " is positive and even.");
                } else {
                    System.out.println("Number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println("Number " + number + " is negative.");
            } else {
                System.out.println("Number " + number + " is zero.");
            }
        }
        
        // Compare first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        System.out.println("\nComparison of first and last elements:");
        if (firstElement == lastElement) {
            System.out.println("First element (" + firstElement + ") is equal to last element (" + lastElement + ")");
        } else if (firstElement > lastElement) {
            System.out.println("First element (" + firstElement + ") is greater than last element (" + lastElement + ")");
        } else {
            System.out.println("First element (" + firstElement + ") is less than last element (" + lastElement + ")");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
