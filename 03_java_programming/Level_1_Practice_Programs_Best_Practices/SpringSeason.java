// Creating Class SpringSeason to check if given date falls in spring season
import java.util.Scanner;

class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input values for month and day
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();
        
        // Check if date falls in spring season (March 20 to June 20)
        boolean isSpring = false;
        
        if (month == 3 && day >= 20) {
            isSpring = true;
        } else if (month == 4 || month == 5) {
            isSpring = true;
        } else if (month == 6 && day <= 20) {
            isSpring = true;
        }
        
        // Print the result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
