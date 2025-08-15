package W7_RationalNumbers.code;

public class Program {

    public void run() {
        System.out.println();

        RationalNumber r1 = new RationalNumber(4, 3);
        RationalNumber r2 = new RationalNumber(2, 4);

        RationalNumber sum1 = Operations.add(r1, r2);
        RationalNumber difference1 = Operations.subtract(r1, r2);
        RationalNumber product1 = Operations.multiply(r1, r2);
        RationalNumber quotient1 = Operations.divide(r1, r2);

        System.out.println("Sum of " + r1 + " and " + r2 + " is: " + sum1);
        System.out.println("Difference of " + r1 + " and " + r2 + " is: " + difference1);
        System.out.println("Product of " + r1 + " and " + r2 + " is: " + product1);
        System.out.println("Quotient of " + r1 + " and " + r2 + " is: " + quotient1);

        System.out.println();

        RationalNumber r3 = new RationalNumber(-1, 2);
        RationalNumber r4 = new RationalNumber(8, 1);

        RationalNumber sum2 = Operations.add(r3, r4);
        RationalNumber difference2 = Operations.subtract(r3, r4);
        RationalNumber product2 = Operations.multiply(r3, r4);
        RationalNumber quotient2 = Operations.divide(r3, r4);

        System.out.println("Sum of " + r3 + " and " + r4 + " is: " + sum2);
        System.out.println("Difference of " + r3 + " and " + r4 + " is: " + difference2);
        System.out.println("Product of " + r3 + " and " + r4 + " is: " + product2);
        System.out.println("Quotient of " + r3 + " and " + r4 + " is: " + quotient2);


    }
}
