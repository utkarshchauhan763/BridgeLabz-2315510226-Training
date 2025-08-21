// Creating Class NumberStorageArray to store numbers in array until 0/negative or max 10 elements
import java.util.Scanner;

class NumberStorageArray {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Create an array of 10 elements and initialize variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter numbers (max 10, enter 0 or negative to stop):");
        
        // Use infinite while loop
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double userNumber = input.nextDouble();
            
            // Check if user entered 0 or negative number to break
            if (userNumber <= 0) {
                break;
            }
            
            // Break if array is full (index reaches 10)
            if (index == 10) {
                System.out.println("Array is full. Cannot enter more numbers.");
                break;
            }
            
            // Store the number in array and increment index
            numbers[index] = userNumber;
            index++;
        }
        
        // Calculate total using for loop
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        
        // Display all numbers and total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of all numbers: " + total);
        
        // Closing the Scanner Stream
        input.close();
    }
}
