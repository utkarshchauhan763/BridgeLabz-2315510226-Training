package Java_Practices.Label2;

import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        } else if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Invalid age entered! Student " + (i + 1) + " cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
            System.out.println("------------------------------------");
        }
        sc.close();
    }
}
