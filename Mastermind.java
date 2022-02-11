import java.util.*;
import java.lang.*;

public class Mastermind {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        int[] digits = new int[4];
        intro();
        generateRandom(r, digits);

        int[] guess = readInput(console);

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

    // Reads input and returns as an array
    public static int[] readInput(Scanner console) {
        System.out.print("Enter in a four digit number: ");
        String digits = console.next();
        int[] digitsArray = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            digitsArray[i] = digits.charAt(i);
        }

        return digitsArray;
    }

    public static void intro() {
        System.out.println("This is mastermind! This is a game where a");
        System.out.println("random 4-digit number is generated and you have");
        System.out.println("to try to guess it. There will be hints. Give it");
        System.out.println("a shot?");
    }
}

