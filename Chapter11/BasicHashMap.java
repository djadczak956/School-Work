package Chapter11;

import java.util.*;

public class BasicHashMap {
    public static void main(String[] args) {
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Damian Jadczak", 3.14);
        salaryMap.put("Seamus Smith", 100000.00);
        salaryMap.put("First Last", 2.72);

        Scanner console = new Scanner(System.in);
        System.out.print("Type a person's name: "); 
        String name = console.nextLine();
        
        if (salaryMap.containsKey(name)) {
            double salary = salaryMap.get(name);
            System.out.printf("%s's salary is $%.2f\n", name, salary);
        }
        console.close();

        System.out.println(salaryMap.toString());
    }
}
