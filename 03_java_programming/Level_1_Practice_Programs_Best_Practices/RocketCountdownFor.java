// Creating Class RocketCountdownFor to countdown for rocket launch using for loop
import java.util.Scanner;

class RocketCountdownFor {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for countdown start
        System.out.print("Enter countdown start number: ");
        int startNumber = input.nextInt();
        
        // Use for loop for countdown
        for (int counter = startNumber; counter >= 1; counter--) {
            System.out.println(counter);
        }
        
        // Launch message
        System.out.println("Rocket Launch!");
        
        // Closing the Scanner Stream
        input.close();
    }
}
