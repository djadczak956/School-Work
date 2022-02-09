import java.util.*;

public class Mastermind {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        int[] digits = new int[4];
        generateRandom(r, digits);

        for (int n : digits) {
            System.out.println(n);
        }
    }

    // Uses random to generate digits 1-9 in the array
    public static void generateRandom(Random r, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);   
        }
    }

    public static void guess(Scanner console) {
        
    }

    public static void intro() {
        System.out.println("This is mastermind! ");
    }
}

