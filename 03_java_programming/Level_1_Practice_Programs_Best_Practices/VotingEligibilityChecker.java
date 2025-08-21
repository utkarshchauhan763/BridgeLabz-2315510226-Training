// Creating Class VotingEligibilityChecker to check if person can vote based on age
import java.util.Scanner;

class VotingEligibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input value for age
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
