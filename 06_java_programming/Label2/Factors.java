package Java_Practices.Label2;

import java.util.Scanner;

public class Factors {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    public static int findProduct(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static int findSumOfSquares(int[] factors) {
        int sumSquares = 0;
        for (int f : factors) {
            sumSquares += Math.pow(f, 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));

        sc.close();
    }
}
