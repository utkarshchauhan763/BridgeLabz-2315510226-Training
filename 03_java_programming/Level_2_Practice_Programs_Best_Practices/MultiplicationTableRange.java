// Creating Class MultiplicationTableRange to find multiplication table from 6 to 9
import java.util.Scanner;

class MultiplicationTableRange {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Use for loop to generate multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
