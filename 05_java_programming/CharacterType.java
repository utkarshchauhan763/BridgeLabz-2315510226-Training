
import java.util.*;
public class CharacterType {
    public static String[][] charTypeArray(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = VowelsConsonantCount.checkCharType(str.charAt(i));
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[][] result = charTypeArray(input);
        displayTable(result);
        sc.close();
    }
}

