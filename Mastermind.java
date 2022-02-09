import java.util.*;

public class Mastermind {
    public static void main(String[] args) {
        Random r = new Random();
        int[] digits = new int[4];
        generateRandom(r, digits);

        for (int n : digits) {
            System.out.println(n);
        }
    }

    public static void generateRandom(Random r, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
    }
}

