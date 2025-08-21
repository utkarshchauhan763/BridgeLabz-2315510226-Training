// Creating Class FriendsComparison to find youngest and tallest among three friends
import java.util.Scanner;

class FriendsComparison {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Get input values for ages of three friends
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        
        // Get input values for heights of three friends
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = input.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = input.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = input.nextDouble();
        
        // Find the youngest friend (smallest age)
        String youngestFriend;
        int youngestAge;
        
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngestFriend = "Amar";
            youngestAge = amarAge;
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngestFriend = "Akbar";
            youngestAge = akbarAge;
        } else {
            youngestFriend = "Anthony";
            youngestAge = anthonyAge;
        }
        
        // Find the tallest friend (largest height)
        String tallestFriend;
        double tallestHeight;
        
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallestFriend = "Amar";
            tallestHeight = amarHeight;
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallestFriend = "Akbar";
            tallestHeight = akbarHeight;
        } else {
            tallestFriend = "Anthony";
            tallestHeight = anthonyHeight;
        }
        
        // Display results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm");
        
        // Closing the Scanner Stream
        input.close();
    }
}
