package W7_Vector2D;

public class Program {

    public void run() {

        // Create two vectors
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(3, 4);

        System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);
        System.out.println();

        // Add both vectors
        Vector2D sum = Operations.add(v1, v2);
        System.out.println("Addition: " + v1 + " + " + v2 + " = " + sum);

        // Subtract both vectors
        Vector2D diff = Operations.subtract(v1, v2);
        System.out.println("Subtraction: " + v1 + " - " + v2 + " = " + diff);

        // Dot product of both vectors
        double dProduct = Operations.dotProduct(v1, v2);
        System.out.println("Dot Product: " + dProduct);

        // Cross Product of both vectors
        double cProduct = Operations.crossProduct(v1, v2);
        System.out.println("Cross Product: " + String.format("%.3f", cProduct));

        // Scalar Multiplication
        Vector2D scaled = Operations.scalarMultiply(2.5, v1);
        System.out.println("Scalar Multiply (2.5 × v1): " + scaled);

        // Magnitude of both vectors
        System.out.println("Magnitude of v1: " + String.format("%.3f", Operations.magnitude(v1)));
        System.out.println("Magnitude of v2: " + String.format("%.3f", Operations.magnitude(v2)));

        // Angle between vectors in radians and degrees
        double angleRad = Operations.angleBetween(v1, v2);
        double angleDeg = Math.toDegrees(angleRad);
        System.out.println("Angle between v1 and v2: " + String.format("%.3f", angleRad)
                                + " radians (" + String.format("%.3f", angleDeg) + " degrees)");

        // Check if vectors are perpendicular
        boolean perpendicular = Math.abs(dProduct) < 1e-10;
        System.out.println("Are v1 and v2 perpendicular? " + perpendicular);

        // 9. Check if vectors are parallel
        boolean parallel = Math.abs(cProduct) < 1e-10;
        System.out.println("Are v1 and v2 parallel? " + parallel);

    }

}
