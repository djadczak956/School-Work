package Chapter11;

import java.util.*;
import java.io.*;

public class CountUniqueWords {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> wordSet = new HashSet<>();
        Scanner input = new Scanner(new File("Chapter11/mobydick.txt"));
        while (input.hasNext()) {
            String word = input.next();
            word = word.toLowerCase();  // Ignore difference in cases
            wordSet.add(word);
        }
    
    System.out.println("Unique word count: " + wordSet.size());
    }
}
