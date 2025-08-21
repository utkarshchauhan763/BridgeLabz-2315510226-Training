// Creating Class DigitFrequencyAnalyzer to find frequency of each digit in a number
import java.util.Scanner;

class DigitFrequencyAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        
        // Make number positive for processing
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
        
        // Extract digits and store in array
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        
        // Create frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];
        
        // Count frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }
        
        // Display the results
        System.out.println("\nDigit Frequency Analysis for number: " + originalNumber);
        System.out.println("Digits in the number:");
        for (int i = digitCount - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nFrequency of each digit:");
        System.out.println("Digit | Frequency");
        System.out.println("------|----------");
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.printf("  %d   |    %d%n", i, frequency[i]);
            }
        }
        
        // Display total digit count
        System.out.println("\nTotal digits in number: " + digitCount);
        
        // Find most frequent digit
        int maxFrequency = 0;
        int mostFrequentDigit = -1;
        
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentDigit = i;
            }
        }
        
        if (mostFrequentDigit != -1 && maxFrequency > 1) {
            System.out.println("Most frequent digit: " + mostFrequentDigit + 
                              " (appears " + maxFrequency + " times)");
        } else {
            System.out.println("All digits appear with equal frequency.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
