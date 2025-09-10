package Week10_Revision.code.Rational_Number;

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
        if (denominator == 0)
        {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Setter
    public void set(int numerator, int denominator) {
        this.numerator = numerator;
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

    // Add method
    public RationalNumber add(RationalNumber r) {

        int newNum = (this.getNumerator() * r.getDenominator()) + (this.getDenominator() * r.getNumerator());
        int newDen = this.getDenominator() * r.getDenominator();

        return new RationalNumber(newNum, newDen);
    }

    public RationalNumber subtract(RationalNumber r) {

        int newNum = (this.getNumerator() * r.getDenominator()) - (this.getDenominator() * r.getNumerator());
        int newDen = this.getDenominator() * r.getDenominator();

        return new RationalNumber(newNum, newDen);
    }

    public RationalNumber multiply(RationalNumber r) {

        int newNum = this.getNumerator() * r.getNumerator();
        int newDen = this.getDenominator() * r.getDenominator();

        return new RationalNumber(newNum, newDen);
    }

    public RationalNumber divide(RationalNumber r) {

        int newNum = this.getNumerator() * r.getDenominator();
        int newDen = this.getDenominator() * r.getNumerator();

        return new RationalNumber(newNum, newDen);
    }

    private int gcd(int n1, int n2) {
        if(n2 == 0)
        {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));

        numerator /= gcd;
        denominator /= gcd;

        // Handle sign: denominator should always be positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    @Override
    public String toString() {

        // Whole number
        if (denominator == 1)
        {
            if (numerator < 0)
            {
                return "(" + numerator + ")";
            }
            return numerator + "";
        }

        // Fraction
        if (numerator < 0)
        {
            return "(" + numerator + "/" + denominator + ")";
        }
        return numerator + "/" + denominator;
    }
}
