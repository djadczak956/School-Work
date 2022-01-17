import java.util.*;
import java.io.*;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException {
        File f = getFile();
        Scanner input = new Scanner(f);
        
        System.out.println("Words: " + wordCount(input));
        System.out.println("Lines: " + lineCount(input));
        charCount(input);
    }


    // Returns the File that will be used
    public static File getFile() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter in a file name --> ");
        File f = new File(console.nextLine());

        // Tries again for file name
        while (!f.exists()) {
            System.out.println("Hm. That did not seem to work. Try again. ");
            System.out.print("Enter in a file name --> ");
            f = new File(console.nextLine());
        }

        return f;
    }


    // Returns the word count 
    public static int wordCount(Scanner input) throws FileNotFoundException {
        int count = 0;
        
        while (input.hasNext()) {
            input.next();
            count++;
        }

        return count;
    }


    // Returns the line count
    public static int lineCount(Scanner input) throws FileNotFoundException {
        int count = 0;

        while (input.hasNextLine()) {
            input.nextLine();   // Move the cursor forward
            count++;
        }
        return count;
    }


    // Returns the character count
    public static int charCount(Scanner input) throws FileNotFoundException {
        return 1;
    }
}
