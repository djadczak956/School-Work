package Chapter11;

import java.util.*;

public class KeysValuesBasics {
    public static void main(String[] args) {
        Map<Integer, String> ssnMap = new HashMap<>();
        ssnMap.put(837520912, "Robert");
        ssnMap.put(731287021, "Jenny");
        ssnMap.put(514892531, "Kyle");

        Set<Integer> ssnSet = ssnMap.keySet();
        System.out.println(ssnSet.toString());
        for (int ssn : ssnSet) {
            System.out.println("SSN: " + ssn);
        }

        System.out.println();
        
        Collection<String> names = ssnMap.values();
        System.out.println(names.toString());
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        System.out.println();

        for (int ssn : ssnSet) {
            String name = ssnMap.get(ssn);
            System.out.println(name + "'s ssn is " + ssn);
        }
    }
}
