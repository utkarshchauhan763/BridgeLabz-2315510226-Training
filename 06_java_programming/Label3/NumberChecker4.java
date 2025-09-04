package Java_Practices.Label3;

public class NumberChecker4 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
    public static int sumDigits(int n) {
        int s = 0; while (n > 0) { s += n % 10; n /= 10; } return s;
    }
    public static int productDigits(int n) {
        int p = 1; while (n > 0) { p *= n % 10; n /= 10; } return p;
    }
    public static boolean isNeon(int n) {
        int sq = n * n;
        return sumDigits(sq) == n;
    }
    public static boolean isSpy(int n) {
        return sumDigits(n) == productDigits(n);
    }
    public static boolean isAutomorphic(int n) {
        String s1 = String.valueOf(n);
        String s2 = String.valueOf(n * n);
        return s2.endsWith(s1);
    }
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(n));
        System.out.println("Automorphic: " + isAutomorphic(n));
        System.out.println("Buzz: " + isBuzz(n));
    }
}
