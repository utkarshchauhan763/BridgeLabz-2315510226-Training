// Creating Class NaturalNumberSumFor to find sum of n natural numbers using for loop and compare with formula
import java.util.Scanner;

class NaturalNumberSumFor {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is a natural number
        if (number > 0) {
            // Calculate using formula
            int formulaResult = number * (number + 1) / 2;
            
            // Calculate using for loop
            int loopResult = 0;
            for (int i = 1; i <= number; i++) {
                loopResult += i;
            }
            
            // Compare results and display
            System.out.println("Sum using formula: " + formulaResult);
            System.out.println("Sum using for loop: " + loopResult);
            
            if (formulaResult == loopResult) {
                System.out.println("Both computations are correct and match!");
            } else {
                System.out.println("There is a discrepancy between the computations.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
