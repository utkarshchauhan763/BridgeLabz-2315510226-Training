// Creating Class BMICalculator2D to calculate BMI using multi-dimensional arrays
import java.util.Scanner;

class BMICalculator2D {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPersons = input.nextInt();
        
        // Create multi-dimensional array to store weight, height, and BMI
        // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        
        // Take input for weight and height of all persons
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            
            // Get weight input with validation
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = input.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight. Please enter a positive value.");
                }
            } while (personData[i][0] <= 0);
            
            // Get height input with validation
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][1] = input.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height. Please enter a positive value.");
                }
            } while (personData[i][1] <= 0);
        }
        
        // Calculate BMI and determine weight status for all persons
        for (int i = 0; i < numberOfPersons; i++) {
            // Calculate BMI = weight / (height * height)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            
            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 25) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        // Display the results
        System.out.println("\n=== BMI CALCULATION RESULTS (Using 2D Array) ===");
        System.out.printf("%-8s %-12s %-12s %-8s %-15s%n", 
                         "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-8d %-12.2f %-12.2f %-8.2f %-15s%n", 
                             (i + 1), personData[i][1], personData[i][0], 
                             personData[i][2], weightStatus[i]);
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
