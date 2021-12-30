// This program guesses two-digit numbers (0-99)
import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        printIntro();
        
        Scanner console = new Scanner(System.in);

        // Picks a random number from 1-99 inclusive
        Random rand = new Random();
        int number = rand.nextInt(100);    

        // First guess
        System.out.print("Your guess? ---> ");
        int guess = console.nextInt();
        int numGuesses = 1;

        // Give hints until correct guess is reached
        while (guess != number) {   // Loop through until the guess is true
            int numMatches = matches(number, guess); 
            System.out.println("Incorrect (hint: " + numMatches + " digits match)");
            guess = getGuess(console);
            numGuesses++;
        }

        System.out.println("You got it right in " + numGuesses + " tries. ");
        console.close();
    }


    // Prints the intro text
    public static void printIntro() {
        System.out.println("Try to guess a number from 0 to 99. \nYou will be told how many digits match.");
    }
    

    // Prompts until a valid integer is entered
    public static int getInt(Scanner console, String prompt) {
        System.out.println(prompt);
        while (!console.hasNextInt()) {
            console.next(); // Discard input
            System.out.println("Not an integer; try again.");
            System.out.println(prompt);
        }
        return console.nextInt();
    }

    // Gets a guess and ensures it is in the proper range
    public static int getGuess(Scanner console) {
        int guess = getInt(console, "Your guess? ---> ");
        while (guess < 0 || guess >= 100) {
            System.out.println("Out of range; try again.");
            guess = getInt(console, "Your guess? ---> ");
        }

        return guess;
    }

    // Checks how many digits match and reports it
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
