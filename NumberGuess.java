// This program guesses two-digit numbers (0-99)
import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Random rand = new Random();
        int number = rand.nextInt(100);    // Picks a random number from 1-99

        System.out.print("Your guess? ---> ");
        int guess = console.nextInt();
        int numGuesses = 1;

        while (guess != number) {   // Loop through until the guess is true
            System.out.println("Incorrect.");
            System.out.print("Your guess? ---> ");
            guess = console.nextInt();
            numGuesses++;
        }

        System.out.println("You got it right in " + numGuesses + " tries. ");
        console.close();
    }
}
