// Creating Class FootballTeamHeightAnalyzer to find mean height of 11 football players
import java.util.Scanner;

class FootballTeamHeightAnalyzer {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Create a double array named heights of size 11
        double[] heights = new double[11];
        
        // Get input values from user for all 11 players
        System.out.println("Enter heights of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }
        
        // Find the sum of all elements in the array
        double sumOfHeights = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sumOfHeights += heights[i];
        }
        
        // Calculate mean height by dividing sum by number of elements
        double meanHeight = sumOfHeights / heights.length;
        
        // Display the mean height
        System.out.println("\nSum of all heights: " + sumOfHeights + " cm");
        System.out.println("Number of players: " + heights.length);
        System.out.println("Mean height of the football team: " + meanHeight + " cm");
        
        // Closing the Scanner Stream
        input.close();
    }
}
