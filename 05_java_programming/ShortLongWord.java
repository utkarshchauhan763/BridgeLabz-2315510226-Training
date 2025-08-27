import java.util.*;
public class ShortLongWord {
    // we are reusing getLength, customSplit, wordLengthArray from SpilitTextLength.java file

    public static String[] findShortestLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int minLen = Integer.parseInt(wordLengths[0][1]);
        int maxLen = minLen;

        for (String[] row : wordLengths) {
            int len = Integer.parseInt(row[1]);
            if (len < minLen) {
                minLen = len;
                shortest = row[0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = row[0];
            }
        }
        return new String[]{shortest, longest};
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = SpilitTextLength.customSplit(input);
        String[][] wordLengths = SpilitTextLength.wordLengthArray(words);
        String[] result = findShortestLongest(wordLengths);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
        sc.close();
    }
}

