public class ListSumRecursive {
    public static void main(String[] args) {
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = i + 1;
        }
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        return sum(list, 0);
    }

    private static int sum(int[] list, int index) {
        if (index == list.length) {
            return 0;
        } else {
            return list[index] + sum(list, index + 1);
        }
    }
}
