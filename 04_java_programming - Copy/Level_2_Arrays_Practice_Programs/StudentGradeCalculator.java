// Creating Class StudentGradeCalculator to calculate grades based on marks in 3 subjects
import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Create arrays to store student data
        int[][] marks = new int[numberOfStudents][3]; // Physics, Chemistry, Maths
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        
        // Take input for marks of all students
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                // Get marks input with validation
                do {
                    System.out.print("Enter marks in " + subjects[j] + " (0-100): ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }
        
        // Calculate percentage and grade for all students
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate total marks
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            
            // Calculate percentage
            percentages[i] = (totalMarks * 100.0) / 300.0;
            
            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else if (percentages[i] >= 50) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }
        
        // Display the results
        System.out.println("\n=== STUDENT GRADE REPORT ===");
        System.out.printf("%-8s %-8s %-10s %-6s %-12s %-6s%n", 
                         "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-8d %-8d %-10d %-6d %-12.2f %-6c%n", 
                             (i + 1), marks[i][0], marks[i][1], marks[i][2], 
                             percentages[i], grades[i]);
        }
        
        System.out.println("\nGrading Scale:");
        System.out.println("A: 90-100%");
        System.out.println("B: 80-89%");
        System.out.println("C: 70-79%");
        System.out.println("D: 60-69%");
        System.out.println("E: 50-59%");
        System.out.println("F: Below 50%");
        
        // Closing the Scanner Stream
        input.close();
    }
}
