package Week10_Revision.code.Vector2d.primitive;

public class Program {

    public void run() {

        Vector2d vec1 = new Vector2d(3, 4);
        Vector2d vec2 = new Vector2d(1, 8);

        // Print original vectors
        System.out.println("Vector vec1 = " + vec1);
        System.out.println("Vector vec2 = " + vec2);

        // Add vectors
        System.out.println("vec1 + vec2 = " + vec1.add(vec2));

        // Subtract vectors
        System.out.println("vec1 - vec2 = " + vec1.subtract(vec2));

        // Dot product
        System.out.println("vec1 · vec2 = " + vec1.dotProduct(vec2));

        // Cross product
        System.out.println("vec1 × vec2 = " + vec1.crossProduct(vec2));

    }
}
