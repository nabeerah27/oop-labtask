package W7_Vector2D;

// Represents a 2D vector with x and y coordinates
public class Vector2D {

    // Private attributes
    private double x;
    private double y;

    // Parameterized constructor
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setter
    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x coordinate
    public double getX() {
        return x;
    }

    // Getter for y coordinate
    public double getY() {
        return y;
    }

    // Returns a string representation of the vector
    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

}
