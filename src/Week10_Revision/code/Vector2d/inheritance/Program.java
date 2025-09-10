package Week10_Revision.code.Vector2d.inheritance;

import Week05_Canvas_Drawing.code.Point;

public class Program {

    public void run() {
        System.out.println();

        Point p1 = new Point(9, 2);
        Point p2 = new Point(7, -3);

        Vector2d vec1 = new Vector2d(p1, p2); // Vector from p1 to p2
        Vector2d vec2 = new Vector2d(-8, 5);  // Vector from origin

        System.out.println("vec1: " + vec1);
        System.out.println("vec2: " + vec2);
        System.out.println();

        System.out.println("vec1 + vec2 = " + vec1.add(vec2));
        System.out.println("vec1 - vec2 = " + vec1.subtract(vec2));

        System.out.println("vec1 . vec2 = " + vec1.dotProduct(vec2));
        System.out.println("vec1 × vec2 = " + vec1.crossProduct(vec2));

        System.out.println("vec1 * 2 = " + vec1.multiply(2));
        System.out.println("vec2 * 5 = " + vec2.multiply(5));

    }
}
