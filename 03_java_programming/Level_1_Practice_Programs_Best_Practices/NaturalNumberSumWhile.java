// Creating Class NaturalNumberSumWhile to find sum of n natural numbers using while loop and compare with formula
import java.util.Scanner;

class NaturalNumberSumWhile {
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
            
            // Calculate using while loop
            int loopResult = 0;
            int counter = 1;
            while (counter <= number) {
                loopResult += counter;
                counter++;
            }
            
            // Compare results and display
            System.out.println("Sum using formula: " + formulaResult);
            System.out.println("Sum using while loop: " + loopResult);
            
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
