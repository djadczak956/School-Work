package Chapter11;

import java.util.*;

// Modified to return odd numbers
public class Sieve {
    public static void main(String[] args) {
        System.out.println("Primes: " + sieve(100));
    }

    // Sieve method for primes from 2 to n
    public static List<Integer> sieve(int n) {
        List<Integer> primes = new LinkedList<>();
        
        List<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        for (int i = 3; i <= n; i += 2) {
            numbers.add(i);
        }

        while (!numbers.isEmpty()) {
            // Remove prime num from numbers 
            // Add prime num into primes
            int front = numbers.remove(0);
            primes.add(front);

            // Remove multiples of prime numbers
            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0) itr.remove();
            }
        }
        
        return primes;
    }
}
