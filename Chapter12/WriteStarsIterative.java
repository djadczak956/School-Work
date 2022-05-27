package Chapter12;

public class WriteStarsIterative {
    public static void main(String[] args) {
        writeStars(10);
    }

    public static void writeStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
