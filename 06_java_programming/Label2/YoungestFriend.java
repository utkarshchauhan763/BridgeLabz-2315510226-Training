package Java_Practices.Label2;

import java.util.Scanner;

public class YoungestFriend {

    public static String findYoungest(int[] ages, String[] names) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index];
    }

    public static String findTallest(int[] heights, String[] names) {
        int maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextInt();
            System.out.println("-----------------------------");
        }

        String youngest = findYoungest(ages, friends);
        String tallest = findTallest(heights, friends);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
