// This program guesses two-digit numbers (0-99)
import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Try to get the two-digit number (1-99)");

        Random rand = new Random();
        int number = rand.nextInt(100);    // Picks a random number from 1-99 inclusives

        // First guess
        System.out.print("Your guess? ---> ");
        int guess = console.nextInt();
        int numGuesses = 1;

        // Give hints until correct guess is reached
        while (guess != number) {   // Loop through until the guess is true
            int numMatches = matches(number, guess); 
            System.out.println("Incorrect (hint: " + numMatches + " digits match)");
            System.out.print("Your guess? ---> ");
            guess = console.nextInt();
            numGuesses++;
        }

        System.out.println("You got it right in " + numGuesses + " tries. ");
        console.close();
    }

    // This method checks how many digits match and reports it
    public static int matches(int number, int guess) {
        int numMatches = 0;

        // Checks if the first digit of guess is equal to either of the digits of the number
        if (guess / 10 == number / 10 || guess / 10 == number % 10) {
            numMatches++; 
        }

        // Checks if the second digit of guess is equal to either of the digits of the number
        // Taking into consideration the case if both digits are the same
        if (guess / 10 != guess % 10 && (guess % 10 == number / 10 || guess % 10 == number % 10)){
            numMatches++;
        }
        
        return numMatches;
    }
}
