package Java_Practices.Label3;

import java.util.Scanner;
import java.util.Random;

public class StudentMarks {

    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // Physics, Chemistry, Math
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][4]; 
        // [Total, Average, Percentage, Grade as number]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0; // 2 decimal places
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    public static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    public static void displayResults(int[][] scores, double[][] results) {
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-12s %-6s\n", 
                "Stud_ID", "Physics", "Chem", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8d %-8.0f %-10.2f %-12.2f %-6s\n", 
                    (i+1), scores[i][0], scores[i][1], scores[i][2], 
                    results[i][0], results[i][1], results[i][2], getGrade(results[i][2]));
        }
        System.out.println("---------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        displayResults(scores, results);
        sc.close();
    }
}
