package Week10_Revision.code.Vector2d.composition;

import Week05_Canvas_Drawing.code.Point;

public class Program {

    public void run() {
        System.out.println();

        // Create two vectors using Points
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        Vector2d vec1 = new Vector2d(p1, p2);   // vector from p1(1,2) to p2(4,6)
        Vector2d vec2 = new Vector2d(3, 5);    // vector from origin to (3,5)

        // Print vectors
        System.out.println("Vector v1: " + vec1);
        System.out.println("Vector v2: " + vec2);
        System.out.println();

        // Add vectors
        System.out.println("vec1 + vec2 = " + vec1.add(vec2));

        // Subtract vectors
        System.out.println("vec1 - vec2 = " + vec1.subtract(vec2));

        // Dot product
        System.out.println("vec1 · vec2 = " + vec1.dotProduct(vec2));

        // Cross product
        System.out.println("vec1 × vec2 = " + vec1.crossProduct(vec2));

        // Scalar multiplication
        System.out.println("vec1 * 7 = " + vec1.scalarMultiply(7));
        System.out.println("vec2 * 10 = " + vec1.scalarMultiply(10));

    }

}
