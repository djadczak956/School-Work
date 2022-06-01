package Chapter12;

import java.util.*;
import java.io.*;

public class Reverse {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Chapter12/sample.txt"));
        reverse(input);
        input.close();
    }

    // Simple method to reverse input
    public static void reverse(Scanner input) {
        if (input.hasNextLine()) {
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }
}
