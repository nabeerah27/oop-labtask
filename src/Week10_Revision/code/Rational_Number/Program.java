package Week10_Revision.code.Rational_Number;

public class Program {

    public void run() {
        System.out.println();

        // Create rational numbers
        RationalNumber r1 = new RationalNumber(2, 3);
        RationalNumber r2 = new RationalNumber(3, -4);
        RationalNumber r3 = new RationalNumber(-1, 9);

        // Display rational numbers
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println();

        // Test addition
        RationalNumber sum1 = r1.add(r2);
        System.out.println(r1 + " + " + r2 + " = " + sum1);

        RationalNumber sum2 = r3.add(r1);
        System.out.println(r3 + " + " + r1 + " = " + sum2);
        System.out.println();

        // Test subtraction
        RationalNumber diff1 = r1.subtract(r2);
        System.out.println(r1 + " - " + r2 + " = " + diff1);

        RationalNumber diff2 = r3.subtract(r1);
        System.out.println(r3 + " - " + r1 + " = " + diff2);
        System.out.println();

        // Test multiplication
        RationalNumber product1 = r1.multiply(r2);
        System.out.println(r1 + " * " + r2 + " = " + product1);

        RationalNumber product2 = r3.multiply(r1);
        System.out.println(r3 + " * " + r1 + " = " + product2);
        System.out.println();

        // Test division
        RationalNumber quotient1 = r1.divide(r2);
        System.out.println(r1 + " / " + r2 + " = " + quotient1);

        RationalNumber quotient2 = r3.divide(r1);
        System.out.println(r3 + " / " + r1 + " = " + quotient2);
        System.out.println();

        // Edge cases
        RationalNumber r4 = new RationalNumber(16, 12);
        System.out.println("16/12 simplifies to: " + r4);

        RationalNumber r5 = new RationalNumber(49, 7);
        System.out.println("49/7 simplifies to: " + r5);

        RationalNumber r6 = new RationalNumber(9, -4);
        System.out.println("Denominator is negative (9/(-4)): " + r6);


    }
}
