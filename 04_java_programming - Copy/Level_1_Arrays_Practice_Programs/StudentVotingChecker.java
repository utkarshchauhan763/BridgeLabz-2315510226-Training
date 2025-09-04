// Creating Class StudentVotingChecker to check voting eligibility for 10 students using arrays
import java.util.Scanner;

class StudentVotingChecker {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Define an array of 10 integer elements for student ages
        int[] studentAges = new int[10];
        
        // Get user input for all 10 student ages
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
        }
        
        // Loop through the array and check voting eligibility
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            
            // Check for invalid age (negative number)
            if (age < 0) {
                System.out.println("Student " + (i + 1) + " has invalid age: " + age);
            }
            // Check if student can vote (18 or above)
            else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            }
            // Student cannot vote (below 18)
            else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
