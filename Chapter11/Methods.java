package Chapter11;

import java.util.*;

public class Methods {
    public static void main(String[] args) {
        List<Integer> part1 = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            part1.add(i);
        }

        List<Integer> part2 = new LinkedList<Integer>();
        for (int i = 11; i <= 20; i++) {
            part2.add(i);
        }

        System.out.println(alternate(part1, part2).toString());
    }

    public static List alternate(List<Integer> first, List<Integer> second) {
        List<Integer> newList = new ArrayList<>();
        Iterator<Integer> itr1 = first.iterator();
        Iterator<Integer> itr2 = second.iterator();
        
        if (first.size() == second.size()) {
            while (itr1.hasNext()) {
                newList.add(itr1.next());                
                newList.add(itr2.next());                
            }
        } else if (first.size() < second.size()) {
            while (itr1.hasNext()) {
                newList.add(itr1.next());
                newList.add(itr2.next());
            }
            while (itr2.hasNext()) {
                newList.add(itr2.next());
            }
        } else {
            while (itr2.hasNext()) {
                newList.add(itr1.next());
                newList.add(itr2.next());
            }
            while (itr1.hasNext()) {
                newList.add(itr1.next());
            }
        }

        return newList;
    }
}
