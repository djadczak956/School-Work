import java.util.*;
import java.io.*;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException {
        intro();
        
        File f = getFile();

        Scanner wordInput = new Scanner(f);
        System.out.println("Words: " + wordCount(wordInput));
        wordInput.close();

        Scanner lineInput = new Scanner(f);
        System.out.println("Lines: " + lineCount(lineInput));
        lineInput.close();

        Scanner charInput = new Scanner(f);
        System.out.println("Characters: " + charCount(charInput));
        charInput.close();
    }

    // Introduces what the program is
    public static void intro() {
        System.out.println("This program will take in a file name and it will tell");
        System.out.println("you how many words, lines, and characters it has.");
        System.out.println();
    }


    // Returns the File that will be used
    public static File getFile() {
        Scanner console = new Scanner(System.in);   
        System.out.print("Enter in a file name --> ");
        File f = new File(console.nextLine());

        // Tries again for file name if it does not exist
        while (!f.exists()) {
            System.out.println("Hm. That did not seem to work. Try again. ");
            System.out.print("Enter in a file name --> ");
            f = new File(console.nextLine());
        }

        console.close();
        return f;
    }


    // Returns the word count 
    public static int wordCount(Scanner input) throws FileNotFoundException {
        int count = 0;
        
        // Checks if there is a next token
        while (input.hasNext()) {
            input.next();   // Move the cursor forward
            count++;
        }

        return count;
    }


    // Returns the line count
    public static int lineCount(Scanner input) throws FileNotFoundException {
        int count = 0;

        // Checks if there is a next line
        while (input.hasNextLine()) {
            input.nextLine();   // Move the cursor forward
            count++;
        }

        return count;
    }


    // Returns the character count
    public static int charCount(Scanner input) throws FileNotFoundException {
        int count = 0;

        while (input.hasNext()) {
            count += input.next().length();  // Adds the length of the token to count
        }
        
        return count;
    }
}
