package Java_Practices.Label1;

import java.util.Scanner;

public class SpringSeason {
    public static boolean isValidDate(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth[month]) return false;
        return true;
    }

    public static boolean isSpringSeason(int month, int day) {
        return ((month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        if (!isValidDate(month, day)) {
            System.out.println("Invalid date! Please enter a valid month and day.");
        } else if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
}
