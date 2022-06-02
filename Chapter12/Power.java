public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2, 16));
    }

    // Compute a number x raised to the power y
    public static int pow(int x, int y) {
        if (y < 0) {
            // If exponent is negative
            throw new IllegalArgumentException("Negative exponent: " + y);
        } else if (y == 0) {
            // Base case
            return 1;
        } else if (y % 2 == 0) {
            // Recursive case if y is even
            return pow (x * x, y / 2);
        } else {
            // Recursive case if y is odd
            return x * pow(x, y - 1);
        }
    }
}
