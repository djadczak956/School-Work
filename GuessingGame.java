import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        String playAgain = "";  // String used for playing again or ending it

        // This is the main loop that runs the game
        do {
            int num = rand.nextInt(100);  // Create a random number for the user to guess
            int guess = 0;  
            int count = 0;  

            // Loop for guessing the number
            // Adds to a count variable for each attempt
            while (guess != num) {
                System.out.print("Guess a number between 1 and 100 --> ");
                guess = console.nextInt();

                // Tells you if guess is too low or high
                if (guess < num) {
                    System.out.print(guess + " is too low so give it another shot --> ");
                    count++;
                } else if (guess > num) {
                    System.out.println();
                    System.out.print(guess + " is too high so give it another shot --> ");
                    count++;
                } else if (guess == num) {
                    System.out.println();
                    System.out.print(guess + " is correct. You win!");
                    count++;
                } 
            }
            
            System.out.println("You made " + count + " attempt(s). Nice!!");    // Displays amount of guess attempts
            System.out.print("Would you like to play again (y/n)? --> ");
            System.out.println();
            playAgain = console.next();
        } while (playAgain.equalsIgnoreCase("y"));  // Play as many times as you want 

        System.out.println("G o o d b y e");
        console.close();    // Closing console
    }
}