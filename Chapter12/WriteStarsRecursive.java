package Chapter12;

public class WriteStarsRecursive {
    public static void main(String[] args) {
        writeStars(10);
    }

    public static void writeStars(int n) {
        if (n == 0) {
            // Base case
            System.out.println();
        } else {
            // Recursive case
            System.out.print("*");
            writeStars(n - 1);
        }
    }
}
