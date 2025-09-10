package Week10_Revision.code.Vector2d.primitive;

public class Vector2d {

    // Private attributes
    private double dx;
    private double dy;

    // Parameterized constructor
    public Vector2d(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    // Setter
    public void set(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    // Getter for x coordinate
    public double get_dx() {
        return dx;
    }

    // Getter for y coordinate
    public double get_dy() {
        return dy;
    }

    public Vector2d add(Vector2d vec) {
        return new Vector2d(this.get_dx() + vec.get_dx(), this.get_dy() + vec.get_dy());
    }

    public Vector2d subtract(Vector2d vec) {
        return new Vector2d(this.get_dx() - vec.get_dx(), this.get_dy() - vec.get_dy());
    }

    public double dotProduct(Vector2d vec) {
        return (this.get_dx() * vec.get_dx() + this.get_dy() * vec.get_dy());
    }

    public double crossProduct(Vector2d vec) {
        return (this.get_dx() * vec.get_dy() - this.get_dy() * vec.get_dx());
    }

    // Returns a string representation of the vector
    @Override
    public String toString() {
        return "(" + this.dx + ", " + this.dy + ")";
    }

}
