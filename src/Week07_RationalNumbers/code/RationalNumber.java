package Week07_RationalNumbers.code;

public class RationalNumber {

    // Private attributes
    private int numerator;
    private int denominator;

    // Default constructor to set default values as 0
    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Parameterized constructor
    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // Setter for denominator
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Getter for numerator
    public int getNumerator() {
        return numerator;
    }

    // Getter for denominator
    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1)
        {
            return numerator + "";      // show as whole number
        }
        return numerator + "/" + denominator;
    }

}
