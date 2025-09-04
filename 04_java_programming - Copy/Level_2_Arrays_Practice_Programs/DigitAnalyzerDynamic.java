// Creating Class DigitAnalyzerDynamic to store all digits with dynamic array expansion
import java.util.Scanner;

class DigitAnalyzerDynamic {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        
        // Define array to store digits with initial size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Handle the case when number is 0
        if (number == 0) {
            digits[0] = 0;
            index = 1;
        } else {
            // Make number positive for processing
            number = Math.abs(number);
            
            // Extract digits and store in array with dynamic expansion
            while (number != 0) {
                // If array is full, expand it
                if (index == maxDigit) {
                    maxDigit += 10; // Increase size by 10
                    int[] temp = new int[maxDigit];
                    
                    // Copy existing digits to new array
                    for (int i = 0; i < digits.length; i++) {
                        temp[i] = digits[i];
                    }
                    
                    // Assign new array to digits
                    digits = temp;
                }
                
                // Extract last digit and store in array
                digits[index] = number % 10;
                number = number / 10;
                index++;
            }
        }
        
        // Find largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        
        // Initialize largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // Display results
        System.out.println("\nAll digits of " + originalNumber + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.println("Total digits processed: " + index);
        
        System.out.println("Largest digit: " + largest);
        if (secondLargest == 0 && index > 1) {
            System.out.println("Second largest digit: All digits are the same");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
