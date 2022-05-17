package Chapter11;

import java.util.*;

public class Lottery {
    public static final int NUMBER = 6;
    public static final int MAX_NUMBER = 40;
    public static final int PRIZE = 100;

    public static void main(String[] args) {
        // Get winning number and ticket sets
        Set<Integer> winning = createWinningNumbers();
        Set<Integer> ticket = getTicket();
        System.out.println();

        // Keep only winning numbers from user's ticket
        Set<Integer> matches = new TreeSet<>(ticket);
        matches.retainAll(winning);

        // Print results
        System.out.println("Your ticket was: " + ticket);
        System.out.println("Winning numbers: " + winning);
        if (matches.size() > 0) {
            double prize = PRIZE * Math.pow(2, matches.size());
            System.out.println("Matched numbers: " + matches);
            System.out.printf("Your prize is $%.2f\n", prize);
        }
    }

    // Generate a set of winning lotto numbers
    public static Set<Integer> createWinningNumbers() {
        Set<Integer> winning = new TreeSet<>();
        Random r = new Random();
        while (winning.size() < NUMBER) {
            int number = r.nextInt(MAX_NUMBER) + 1;
            winning.add(number);
        }
        return winning;
    }

    public static Set<Integer> getTicket() {
        Set<Integer> ticket = new TreeSet<>();
        Scanner console = new Scanner(System.in);
        System.out.print("Type " + NUMBER + " lotto numbers: ");
        while (ticket.size() < NUMBER) {
            int number = console.nextInt();
            ticket.add(number);
        }
        console.close();
        return ticket;
    }
}
