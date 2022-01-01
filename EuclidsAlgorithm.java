import java.lang.Math;

public class EuclidsAlgorithm {
    public static void main(String[] args) {
        System.out.println(gcd(-512, -12));
    }

    public static int gcd(int a, int b) {
        int lower = Math.min(a, b);
        int greater = Math.max(a, b);
        int divisor = 0;

        if (lower == 0 && greater == 0) {
            return 0;
        } else if (lower == 0 || greater == 0) {
            return Math.max(lower, greater);
        }

        if (greater % lower == 0) {
            return lower;
        }


        while (greater % lower != 0) {
            divisor = greater % lower;
            
            greater = lower;
            lower = divisor;
        }

        if (greater < 0 && lower < 0) {
            return -1 * divisor;
        }

        return divisor;
    }
}
