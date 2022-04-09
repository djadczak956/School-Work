// This program takes in a file and reverses the order of words

import java.util.*;     // For Scanner and ArrayList
import java.io.*;       // For File

public class ReverseFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("sample.txt"));
        PrintStream output = new PrintStream(new File("reversed_text.txt"));
        ArrayList<String> reversedArray = reverseArray(convertToList(input));
        writeToFile(output, reversedArray);
    }

    // Uses Scanner to take all the words of a file and convert to a list
    public static ArrayList<String> convertToList(Scanner input) {
        ArrayList<String> list = new ArrayList<String>();
        while (input.hasNext()) {
            list.add(input.next());
        }
        return list;
    }

    // I could just easily print out the array into the file in reverse order 
    // but I am going to return a reversed array for giggles
    public static ArrayList<String> reverseArray(ArrayList<String> list) {
        ArrayList<String> reversed = new ArrayList<String>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void writeToFile(PrintStream output, ArrayList<String> reversedList) {
        for (String element : reversedList) {
            output.print(element + "\n");
        }
    }
}
