import java.util.*;

public class SpilitTextCompare {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[] customSplit(String str) {
        int len = getLength(str);
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            }
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] builtInSplit = input.split(" ");
        String[] customSplit = customSplit(input);

        System.out.println("Built-in split: " + Arrays.toString(builtInSplit));
        System.out.println("Custom split: " + Arrays.toString(customSplit));
        System.out.println("Are both equal? " + compareArrays(builtInSplit, customSplit));
        sc.close();
    }
}
