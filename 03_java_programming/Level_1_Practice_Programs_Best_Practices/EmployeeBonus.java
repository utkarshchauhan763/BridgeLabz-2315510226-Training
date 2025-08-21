// Creating Class EmployeeBonus to calculate bonus based on years of service
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input values for salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();
        
        // Calculate bonus amount
        double bonusAmount = 0.0;
        
        // Check if years of service is more than 5 years
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05; // 5% bonus
            System.out.println("Employee is eligible for bonus.");
        } else {
            System.out.println("Employee is not eligible for bonus.");
        }
        
        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonusAmount);
        
        // Closing the Scanner Stream
        input.close();
    }
}
