// Creating Class EmployeeBonusCalculator to calculate bonus for 10 employees based on years of service
import java.util.Scanner;

class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Define arrays to store employee data
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmounts = new double[10];
        double[] newSalaries = new double[10];
        
        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        
        // Loop to take input from user for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            
            // Get salary input with validation
            do {
                System.out.print("Enter salary: ");
                salaries[i] = input.nextDouble();
                if (salaries[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive value.");
                }
            } while (salaries[i] <= 0);
            
            // Get years of service input with validation
            do {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative value.");
                }
            } while (yearsOfService[i] < 0);
        }
        
        // Loop to calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonusAmounts[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonusAmounts[i] = salaries[i] * 0.02; // 2% bonus
            }
            
            // Calculate new salary
            newSalaries[i] = salaries[i] + bonusAmounts[i];
            
            // Add to totals
            totalBonus += bonusAmounts[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        // Display results
        System.out.println("\n=== EMPLOYEE BONUS REPORT ===");
        System.out.printf("%-10s %-12s %-15s %-12s %-12s%n", 
                         "Employee", "Old Salary", "Years Service", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12.2f %-15.1f %-12.2f %-12.2f%n", 
                             (i + 1), salaries[i], yearsOfService[i], bonusAmounts[i], newSalaries[i]);
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        // Closing the Scanner Stream
        input.close();
    }
}
