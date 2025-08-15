package W7_ComplexNumbers.code;

public class App {

    public void run() {
        System.out.println();

        ComplexNumber c1 = new ComplexNumber(3, 4.3);   // 3 + 4i
        ComplexNumber c2 = new ComplexNumber(1.5, -2);  // 1 - 2i

        System.out.println("Complex Number c1: " + c1);
        System.out.println("Complex Number c2: " + c2);
        System.out.println();

        // Addition
        ComplexNumber sum = Operations.add(c1, c2);
        System.out.println("Sum of (" + c1 + ") and (" + c2 + ") is: " + sum);

        // Subtraction
        ComplexNumber difference = Operations.subtract(c1, c2);
        System.out.println("Difference of (" + c1 + ") and (" + c2 + ") is: " + difference);

        // Multiplication
        ComplexNumber product = Operations.multiply(c1, c2);
        System.out.println("Product of (" + c1 + ") and (" + c2 + ") is: " + product);

        // Division
        ComplexNumber quotient = Operations.divide(c1, c2);
        System.out.println("Quotient of (" + c1 + ") and (" + c2 + ") is: " + quotient);
        System.out.println();

        // Magnitude
        System.out.printf("Magnitude of c1: %.2f%n", Operations.magnitude(c1));
        System.out.printf("Magnitude of c2: %.2f%n", Operations.magnitude(c2));
        System.out.println();

        // Conjugate
        System.out.println("Conjugate of c1 (" + c1 + "): " + Operations.conjugate(c1));
        System.out.println("Conjugate of c2 (" + c2 + "): " + Operations.conjugate(c2));
        System.out.println();

        // Additive Inverse
        System.out.println("Additive Inverse of c1 (" + c1 + "): " + Operations.additiveInverse(c1));
        System.out.println("Additive Inverse of c2 (" + c2 + "): " + Operations.additiveInverse(c2));
        System.out.println();

        // Multiplicative Inverse
        System.out.println("Multiplicative Inverse of c1 (" + c1 + "): " + Operations.multiplicativeInverse(c1));
        System.out.println("Multiplicative Inverse of c2 (" + c2 + "): " + Operations.multiplicativeInverse(c2));
        System.out.println();

        // Equality Check
        boolean equal = new Operations().isEqual(c1, c2);
        System.out.println("Are c1 and c2 equal? " + equal);

    }

}
