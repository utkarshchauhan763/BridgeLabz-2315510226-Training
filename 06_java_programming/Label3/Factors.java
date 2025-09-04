package Java_Practices.Label3;

public class Factors {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }
    public static int greatest(int[] f) {
        int g = f[0]; for (int x : f) if (x > g) g = x; return g;
    }
    public static int sum(int[] f) {
        int s = 0; for (int x : f) s += x; return s;
    }
    public static int product(int[] f) {
        int p = 1; for (int x : f) p *= x; return p;
    }
    public static double productCubes(int[] f) {
        double p = 1; for (int x : f) p *= Math.pow(x,3); return p;
    }
    public static void main(String[] args) {
        int n = 12;
        int[] f = findFactors(n);
        System.out.println("Greatest: " + greatest(f));
        System.out.println("Sum: " + sum(f));
        System.out.println("Product: " + product(f));
        System.out.println("Product of Cubes: " + productCubes(f));
    }
}
