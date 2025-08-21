// Creating Class BMICalculator to calculate BMI and determine weight status for multiple persons
import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPersons = input.nextInt();
        
        // Create arrays to store person data
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];
        
        // Take input for weight and height of all persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            
            // Get weight input with validation
            do {
                System.out.print("Enter weight (in kg): ");
                weights[i] = input.nextDouble();
                if (weights[i] <= 0) {
                    System.out.println("Invalid weight. Please enter a positive value.");
                }
            } while (weights[i] <= 0);
            
            // Get height input with validation
            do {
                System.out.print("Enter height (in meters): ");
                heights[i] = input.nextDouble();
                if (heights[i] <= 0) {
                    System.out.println("Invalid height. Please enter a positive value.");
                }
            } while (heights[i] <= 0);
        }
        
        // Calculate BMI and determine weight status for all persons
        for (int i = 0; i < numberOfPersons; i++) {
            // Calculate BMI = weight / (height * height)
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            
            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        // Display the results
        System.out.println("\n=== BMI CALCULATION RESULTS ===");
        System.out.printf("%-8s %-12s %-12s %-8s %-15s%n", 
                         "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-8d %-12.2f %-12.2f %-8.2f %-15s%n", 
                             (i + 1), heights[i], weights[i], bmis[i], weightStatus[i]);
        }
        
        System.out.println("\nBMI Categories:");
        System.out.println("Underweight: BMI < 18.5");
        System.out.println("Normal weight: BMI 18.5 - 24.9");
        System.out.println("Overweight: BMI 25 - 29.9");
        System.out.println("Obesity: BMI >= 30");
        
        // Closing the Scanner Stream
        input.close();
    }
}
