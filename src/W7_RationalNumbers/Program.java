package W7_RationalNumbers;

public class Program {

    public void run() {

        RationalNumber r1 = new RationalNumber(4, 3);
        RationalNumber r2 = new RationalNumber(2, 4);

        RationalNumber sum = Operations.add(r1, r2);
        RationalNumber difference = Operations.subtract(r1, r2);
        RationalNumber product = Operations.multiply(r1, r2);
        RationalNumber quotient = Operations.divide(r1, r2);

        System.out.println("Sum of " + r1 + " and " + r2 + " is: " + sum);
        System.out.println("Difference of " + r1 + " and " + r2 + " is: " + difference);
        System.out.println("Product of " + r1 + " and " + r2 + " is: " + product);
        System.out.println("Quotient of " + r1 + " and " + r2 + " is: " + quotient);


    }
}
