// This program takes in a file and reverses the order of words

import java.util.*;     // For Scanner and ArrayList
import java.io.*;       // For File

public class ReverseFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("sample.txt"));
    }

    public static ArrayList<String> convertToList(Scanner input) {
        ArrayList<String> list = new ArrayList<String>();
        while (input.hasNext()) {
            list.add(input.next());
        }

        return list;
    }
}
