public class FactorsOfTwo {
    public static void main(String[] args) {
        showTwos(24);
    }

    public static void showTwos(int num) {
        int count = 0;

        System.out.print(num + " = ");

        if (num % 2 != 0) {
            System.out.println(+ num);
        } else if (num % 2 == 0) {

            while (num % 2 == 0) {
                num = num / 2;
                count++;
            }
            
            for (int i = 1; i <= count; i++) {
                System.out.print("2 * ");
            }   

            if (num != 1) {
                System.out.print(num);
            }
        }
    }
}
