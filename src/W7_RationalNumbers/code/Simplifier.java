package W7_RationalNumbers.code;

public class Simplifier {

    // Simplifies a RationalNumber and returns a new simplified object
    public static RationalNumber simplify(RationalNumber r) {

        int num = r.getNumerator();
        int den = r.getDenominator();

        // Find GCD of numerator and denominator using their absolute values
        int gcd = gcd(Math.abs(num), Math.abs(den));

        if (den == 0)
        {
            System.out.println("Denominator cannot be zero");
        }

        // Keep denominator positive
        if (den < 0)
        {
            num = - num;
            den = - den;
        }

        // Return a new simplified RationalNumber
        return new RationalNumber(num / gcd, den / gcd);
    }

    // Recursive method to calculate GCD
    public static int gcd(int a, int b) {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }

}
