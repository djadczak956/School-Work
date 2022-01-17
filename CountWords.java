import java.util.*;
import java.io.*;

public class CountWords {
    public static void main(String[] args) {
        getFile();
    }


    public static File getFile() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter in a file name --> ");
        File f = new File(console.nextLine());

        while (!f.exists()) {
            System.out.println("Hm. That did not seem to work. Try again. ");
            System.out.print("Enter in a file name --> ");
            f = new File(console.nextLine());
        }

        console.close();
        return f;
    }


    public static int wordCount(Scanner input) throws FileNotFoundException {
        return 1;
    }


    public static int lineCount(Scanner input) throws FileNotFoundException {
        return 1;
    }


    public static int charCount(Scanner input) throws FileNotFoundException {
        return 1;
    }
}
