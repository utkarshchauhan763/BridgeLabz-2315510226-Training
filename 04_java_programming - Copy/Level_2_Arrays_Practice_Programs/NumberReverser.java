// Creating Class NumberReverser to reverse a number using arrays
import java.util.Scanner;

class NumberReverser {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        
        // Handle negative numbers
        boolean isNegative = number < 0;
        number = Math.abs(number);
        
        // Find count of digits in the number
        int digitCount = 0;
        int temp = number;
        
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp != 0) {
                digitCount++;
                temp = temp / 10;
            }
        }
        
        // Create array to store digits
        int[] digits = new int[digitCount];
        
        // Store digits in array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        
        // Create array to store digits in reverse order
        int[] reverseDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reverseDigits[i] = digits[digitCount - 1 - i];
        }
        
        // Display original digits
        System.out.println("\nOriginal number: " + originalNumber);
        System.out.print("Digits in original order: ");
        for (int i = digitCount - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        // Display reversed digits
        System.out.print("Digits in reverse order: ");
        for (int i = 0; i < reverseDigits.length; i++) {
            System.out.print(reverseDigits[i] + " ");
        }
        System.out.println();
        
        // Construct and display reversed number
        System.out.print("Reversed number: ");
        if (isNegative) {
            System.out.print("-");
        }
        for (int i = 0; i < reverseDigits.length; i++) {
            System.out.print(reverseDigits[i]);
        }
        System.out.println();
        
        // Closing the Scanner Stream
        input.close();
    }
}
