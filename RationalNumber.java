public class RationalNumber {
    private int numerator;
    private int denominator;

    // Constructs an object that is 0/1
    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructs an object with values of your choice
    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Accessor for denominator
    public int getDenominator() {
        return denominator;
    }
    // Accessor for numerator
    public int getNumerator() {
        return numerator;
    }

    // String representation for example: "5/3"
    public String printRational() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        }
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);  // Executes when if statement is false
    }
    // @TODO: Keep values simplified
    public void simplify() {
        if (denominator == 0) {     // Gives error if denominator is zero
            throw new ArithmeticException("You can't divide by zero!!");
        }

        if (numerator == denominator) {     // Checks if value is simply 1
            numerator = 1;
            denominator = 1;
        }
        
        for (int x = 2; x <= 10; x++) {
            while (numerator % x == 0 && denominator % x == 0) {    // Checks if both values are divisible by x from for loop
                numerator = numerator / x;
                denominator = denominator / x;
            }
        }
    }
}
