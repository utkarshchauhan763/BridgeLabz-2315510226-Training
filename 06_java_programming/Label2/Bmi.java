package Java_Practices.Label2;

import java.util.Scanner;

public class Bmi {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100; // convert cm to m
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    
    public static String[] determineStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3]; // 10 rows, 3 columns (weight, height, BMI)

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            System.out.println("----------------------------------");
        }

        calculateBMI(data);
        String[] statuses = determineStatus(data);

        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    data[i][0], data[i][1], data[i][2], statuses[i]);
        }

        sc.close();
    }
}
