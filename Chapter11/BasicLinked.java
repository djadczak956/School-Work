package Chapter11;

import java.util.LinkedList;
import java.util.Iterator;

public class BasicLinked {
    public static void main(String[] args) {
        LinkedList<Integer> numsList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            numsList.add(i);
        }
        System.out.println("Before: " + numsList.toString());
        removeEvens(numsList);
        System.out.println("\nAfter: " + numsList.toString());
    }

    // Removes even numbers
    public static void removeEvens(LinkedList<Integer> list) {
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int element = itr.next();
            if (element % 2 == 0) {
                itr.remove();
            }
        }
    }
}
