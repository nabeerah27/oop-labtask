package Week10_Revision.code.Vector2d.inheritance;

import Week05_Canvas_Drawing.code.Point;

public class Vector2d extends Point {

    private Point end;

    // Parameterized constructor
    public Vector2d(Point start, Point end) {
        super(start);       // call Point’s copy constructor
        this.end = new Point(end);
    }

    // Constructor (Vector from origin)
    public Vector2d(int x, int y) {
        super(0, 0);        // start at origin
        this.end = new Point(x, y);
    }

    // Copy constructor
    public Vector2d(Vector2d other) {
        super(other);       // copy start
        this.end = new Point(other.end);
    }

    // Getters
    public Point getStart() {
        return new Point(this.getX(), this.getY());  // parent stores start
    }

    public Point getEnd() {
        return new Point(end);
    }

    // Components
    public int getXComponent() {
        return end.getX() - getX();
    }

    public int getYComponent() {
        return end.getY() - getY();
    }

    // Add vectors
    public Vector2d add(Vector2d v) {
        int newX = this.getXComponent() + v.getXComponent();
        int newY = this.getYComponent() + v.getYComponent();
        return new Vector2d(newX, newY); // from origin
    }

    // Subtract vectors
    public Vector2d subtract(Vector2d v) {
        int newX = this.getXComponent() - v.getXComponent();
        int newY = this.getYComponent() - v.getYComponent();
        return new Vector2d(newX, newY);
    }

    // Dot product (vector · vector → scalar) -> (x1⋅x2)+(y1.y2)
    public int dotProduct(Vector2d vec) {
        int xPart = this.getXComponent() * vec.getXComponent();
        int yPart = this.getYComponent() * vec.getYComponent();
        return xPart + yPart;
    }

    // Cross product in 2d (vector x vector = scalar) -> (x1⋅y2)−(y1.x2)
    public int crossProduct(Vector2d vec) {
        int xPart = this.getXComponent() * vec.getYComponent();
        int yPart = this.getYComponent() * vec.getXComponent();
        return xPart - yPart;
    }

    // Scalar multiplication
    public Vector2d multiply(int scalar) {
        int newX = this.getXComponent() * scalar;
        int newY = this.getYComponent() * scalar;
        return new Vector2d(newX, newY);
    }

    @Override
    public String toString() {
        return "Vector from " + getStart() + " to " + end +
                " → Components: (" + getXComponent() + ", " + getYComponent() + ")";
    }

}
