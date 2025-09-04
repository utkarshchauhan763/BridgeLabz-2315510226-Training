package Java_Practices.Label3;

import java.util.Scanner;

public class LineEquationDistance {
    
    public static double findDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double[] result = new double[2]; // [slope, intercept]
        
        if (x1 == x2) { 
            System.out.println("Vertical line, slope is undefined!");
            result[0] = Double.POSITIVE_INFINITY; 
            result[1] = Double.NaN; 
        } else {
            double m = (double)(y2 - y1) / (x2 - x1);
            double b = y1 - (m * x1);
            result[0] = m;
            result[1] = b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();
        
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance between points = " + distance);

        double[] lineEq = findLineEquation(x1, y1, x2, y2);
        if (lineEq[0] != Double.POSITIVE_INFINITY) {
            System.out.println("Equation of line: y = " + lineEq[0] + " * x + " + lineEq[1]);
        }
        
        sc.close();
    }
}
