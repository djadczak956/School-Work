package Chapter11;

import java.util.*;


public class Sieve {
    public static void main(String[] args) {
        System.out.println("Primes: " + sieve(100));
    }

    // Sieve method for primes from 2 to n
    public static List<Integer> sieve(int n) {
        List<Integer> primes = new LinkedList<>();
        
        List<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
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
