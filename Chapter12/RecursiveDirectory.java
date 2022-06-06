import java.util.*;
import java.io.*;

public class RecursiveDirectory {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Directory or file name: ");
        String name = console.nextLine();
        File f = new File(name);
        if (!f.exists()) {
            System.out.println("No such file/directory");
        } else {
            print(f, 0);
        }

        console.close();
    }

    public static void print(File f, int level) {
        for (int i = 0; i < level; i++) {
            // Indentation
            System.out.print("\t");
        }

        System.out.println(f.getName());
        if (f.isDirectory()) {
            for (File subF : f.listFiles()) {
                print(subF, level + 1);
            }
        }
    }
}
