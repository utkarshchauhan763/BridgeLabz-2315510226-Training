// Creating Class RocketCountdownWhile to countdown for rocket launch using while loop
import java.util.Scanner;

class RocketCountdownWhile {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for countdown start
        System.out.print("Enter countdown start number: ");
        int counter = input.nextInt();
        
        // Use while loop for countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }
        
        // Launch message
        System.out.println("Rocket Launch!");
        
        // Closing the Scanner Stream
        input.close();
    }
}
