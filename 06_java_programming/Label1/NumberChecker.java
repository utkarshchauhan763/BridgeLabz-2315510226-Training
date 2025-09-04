package Java_Practices.Label1;

import java.util.Scanner;

public class NumberChecker {
    public static int checkNumber(int n) {
        if (n > 0) {
            return 1; 
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = checkNumber(num);

        if (result == 1) {
            System.out.println(num + " is Positive");
        } else if (result == -1) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Zero");
        }

        sc.close();
    }
}
