package W7_RationalNumbers;

public class Operations {

    public static RationalNumber add(RationalNumber r1, RationalNumber r2) {

        int newNumerator = (r1.getNumerator() * r2.getDenominator()) + (r1.getDenominator() * r2.getNumerator());
        int newDenominator = r1.getDenominator() * r2.getDenominator();

        return Simplifier.simplify(new RationalNumber(newNumerator, newDenominator));

    }

    public static RationalNumber subtract(RationalNumber r1, RationalNumber r2) {

        int newNumerator = (r1.getNumerator() * r2.getDenominator()) - (r1.getDenominator() * r2.getNumerator());
        int newDenominator = r1.getDenominator() * r2.getDenominator();

        return Simplifier.simplify(new RationalNumber(newNumerator, newDenominator));

    }

    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2) {

        int newNumerator = r1.getNumerator() * r2.getNumerator();
        int newDenominator = r1.getDenominator() * r2.getDenominator();

        return Simplifier.simplify(new RationalNumber(newNumerator, newDenominator));

    }

    public static RationalNumber divide (RationalNumber r1, RationalNumber r2) {

        int newNumerator = r1.getNumerator() * r2.getDenominator();
        int newDenominator = r1.getDenominator() * r2.getNumerator();

        return Simplifier.simplify(new RationalNumber(newNumerator, newDenominator));

    }

}
