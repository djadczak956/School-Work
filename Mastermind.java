import java.util.*;
import java.lang.*;

public class Mastermind {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner console = new Scanner(System.in);
        intro();
        char[] randomDigits = generateRandom(r);
        char[] guessDigits = readInput(console);
        System.out.println("Guess: " + Arrays.toString(guessDigits));
        System.out.println("Random: " + Arrays.toString(randomDigits));
        System.out.println(checkGuess(console, randomDigits, guessDigits));
    }

    // Uses random to generate digits 1-9 in the array
    public static char[] generateRandom(Random r) {
        int[] array = new int[4];
        char[] randomDigits = new char[4];
        for (int i = 0; i < 4; i++) {
            array[i] = r.nextInt(10);   
        }

        for (int i = 0; i < 4; i++) {
            randomDigits[i] = (char) (array[i] + '0');
        }
        return randomDigits;
    }

    // Reads input and returns as an array
    public static char[] readInput(Scanner console) {
        int input = 0;
        System.out.print("Enter in a four digit number: ");
        while (!console.hasNextInt()) {
            console.next();
            System.out.println("Please enter an integer.");
            System.out.print("Enter in a four digit number (1-9): ");
        }
        input = console.nextInt();

        char[] temp = String.valueOf(input).toCharArray();
        char[] digitsArray = new char[4];
        for (int i = 0; i < 4; i++) {
            digitsArray[i] = temp[i];
        }

        return digitsArray;
    }

    // Will compare the guess digits to the randomly generated digits
    public static String checkGuess(Scanner console, char[] randomDigits, char[] guessDigits) {
        int posCount;  // Count for right digits in wrong place
        int correctCount; // Count for right digits in right place
        while (!Arrays.equals(randomDigits, guessDigits)) {
            posCount = 0;
            correctCount = 0;
            for (int i = 0; i < 4; i++) {
                if (guessDigits[i] == randomDigits[i]) {
                    correctCount++;
                } 
                for (int j = 0; j < 4; j++) {
                    if (guessDigits[i] == randomDigits[j]) {
                        posCount++;
                    }
                }
            }
            System.out.println("positionCount: " + posCount + ", correctCount: " + correctCount);
            guessDigits = readInput(console);
        }   
        return "Nice!";
    }

    // Prints out the intro of the game 
    public static void intro() {
        System.out.println("This is mastermind! This is a game where a");
        System.out.println("random 4-digit number is generated and you have");
        System.out.println("to try to guess it. There will be hints. Give it");
        System.out.println("a shot? (Note: if you enter in a number larger than");
        System.out.println("4-digits, only the first 4-digits will be accepted) ");
    }
}

