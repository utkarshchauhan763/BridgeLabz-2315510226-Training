// Creating Class FriendsComparisonArray to find youngest and tallest among three friends using arrays
import java.util.Scanner;

class FriendsComparisonArray {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Define arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] friendNames = {"Amar", "Akbar", "Anthony"};
        
        // Take user input for age and height of 3 friends
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friendNames[i] + ":");
            System.out.print("Enter age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter height (in cm): ");
            heights[i] = input.nextDouble();
        }
        
        // Find the youngest friend (minimum age)
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Find the tallest friend (maximum height)
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Display the results
        System.out.println("\n=== FRIENDS COMPARISON RESULTS ===");
        System.out.println("Friend Details:");
        for (int i = 0; i < 3; i++) {
            System.out.println(friendNames[i] + " - Age: " + ages[i] + ", Height: " + heights[i] + " cm");
        }
        
        System.out.println("\nThe youngest friend is " + friendNames[youngestIndex] + 
                          " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + friendNames[tallestIndex] + 
                          " with height " + heights[tallestIndex] + " cm");
        
        // Closing the Scanner Stream
        input.close();
    }
}
