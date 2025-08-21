// Creating Class SmallestNumberChecker to check if first number is smallest among three
import java.util.Scanner;

class SmallestNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input values for three numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third number: ");
        int number3 = input.nextInt();
        
        // Check if first number is the smallest
        boolean isFirstSmallest = (number1 <= number2) && (number1 <= number3);
        
        // Print the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        
        // Closing the Scanner Stream
        input.close();
    }
}
