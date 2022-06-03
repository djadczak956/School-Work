public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(5, 25));
    }

    public static int gcd(int x, int y) {
        if (x < 0 || y < 0) {
            // Handle negatives
            return gcd(Math.abs(x), Math.abs(y));
        } else if (y == 0) {
            // Base case
            return x;
        } else {
            // Recursive case
            return gcd(y, x % y);
        }
    }
}
