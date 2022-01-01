import java.lang.Math;

public class EuclidsAlgorithm {
    public static void main(String[] args) {
        System.out.println(gcd(0, 120));
    }

    public static int gcd(int a, int b) {
        int lower = Math.min(a, b);
        int greater = Math.max(a, b);
        int divisor = 0;

        if (greater == 0) {
            return lower;
        } else if (lower == 0) {
            return greater;
        } else if (lower == 0 && greater == 0) {
            return 0;
        }

        while (greater % lower != 0) {
            divisor = greater % lower;
            
            greater = lower;
            lower = divisor;
        }
        return divisor;
    }
}
