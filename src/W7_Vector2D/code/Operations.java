package W7_Vector2D.code;

public class Operations {

    // Add two vectors; returns a vector
    public static Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.getX() + v2.getX(), v1.getY() + v2.getY());
    }

    // Subtract v2 from v1; returns a vector
    public static Vector2D subtract(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.getX() - v2.getX(), v1.getY() - v2.getY());
    }

    // Dot product of two vectors; returns scalar (double)
    public static double dotProduct(Vector2D v1, Vector2D v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }

    // Cross product of two vectors; returns scalar (double)
    public static double crossProduct(Vector2D v1, Vector2D v2) {
        return v1.getX() * v2.getY() - v1.getY() * v2.getX();
    }

    // Scalar multiplication; returns a vector
    public static Vector2D scalarMultiply(double scalar, Vector2D vec) {
        return new Vector2D(vec.getX() * scalar, vec.getY() * scalar);
    }

    // Magnitude of vector
    public static double magnitude(Vector2D vec) {
        return Math.sqrt(vec.getX() * vec.getX() + vec.getY() * vec.getY());
    }

    // Angle between two vectors in radians
    public static double angleBetween(Vector2D v1, Vector2D v2) {

        double product = dotProduct(v1, v2);
        double mag = magnitude(v1) * magnitude(v2);

        if (mag == 0)
        {
            return 0;
        }
        return Math.acos(product / mag);
    }

}
