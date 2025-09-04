package Java_Practices.Label3;

public class NumberChecker1 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }
    public static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static boolean isDuck(int n) {
        int[] d = digits(n);
        for (int x : d) if (x == 0) return true;
        return false;
    }
    public static boolean isArmstrong(int n) {
        int[] d = digits(n);
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }
    public static int[] largestTwo(int[] d) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > f) { s = f; f = x; }
            else if (x > s && x != f) s = x;
        }
        return new int[]{f, s};
    }
    public static int[] smallestTwo(int[] d) {
        int f = Integer.MAX_VALUE, s = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < f) { s = f; f = x; }
            else if (x < s && x != f) s = x;
        }
        return new int[]{f, s};
    }
    public static void main(String[] args) {
        int n = 153;
        int[] d = digits(n);
        System.out.println("Duck: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        int[] l = largestTwo(d), s = smallestTwo(d);
        System.out.println("Largest: " + l[0] + ", Second Largest: " + l[1]);
        System.out.println("Smallest: " + s[0] + ", Second Smallest: " + s[1]);
    }
}
