package Java_Practices.Label1;

import java.util.Scanner;

public class AthleteRun {
    public static double calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        double totalDistance = 5000;
        double rounds = calculateRounds(side1, side2, side3, totalDistance);
        System.out.println("The athlete needs to complete " 
                            + Math.ceil(rounds) + " rounds to finish 5 km run.");

        sc.close();
    }
}
