public class RataionalNumber {
    private int numerator;
    private int denominator;

    // Constructs an object that is 0/1
    public RataionalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Constructs an object with values of your choice
    public RataionalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
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
}
