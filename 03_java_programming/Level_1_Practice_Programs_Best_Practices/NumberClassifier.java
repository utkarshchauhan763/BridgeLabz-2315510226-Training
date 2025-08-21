// Creating Class NumberClassifier to check if number is positive, negative, or zero
import java.util.Scanner;

class NumberClassifier {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number " + number + " is positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative");
        } else {
            System.out.println("The number " + number + " is zero");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
