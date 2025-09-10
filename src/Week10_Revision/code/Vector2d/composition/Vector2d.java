package Week10_Revision.code.Vector2d.composition;

import Week05_Canvas_Drawing.code.Point;

// Vector2d class using composition (composed of Points)

public class Vector2d {

    private Point start;  // Starting point of the vector
    private Point end;   // Ending point of the vector

    // Parameterized constructor
    public Vector2d(Point start, Point end) {
        this.start = new Point(start);  // use copy constructor
        this.end = new Point(end);
    }

    // Constructor -> Vector from origin (0,0) to (x,y)
    public Vector2d(int x, int y) {
        this.start = new Point(0, 0);
        this.end = new Point(x, y);
    }

    // Getters
    public Point getStart() {
        return new Point(start);
    }

    public Point getEnd() {
        return new Point(end);
    }

    // Get components (difference between end and start)
    public int getXComponent() {
        return end.getX() - start.getX();
    }

    public int getYComponent() {
        return end.getY() - start.getY();
    }

    // Add two vectors
    public Vector2d add(Vector2d vec) {
        int newX = this.getXComponent() + vec.getXComponent();
        int newY = this.getYComponent() + vec.getYComponent();
        return new Vector2d(newX, newY);  // from origin
    }

    // Subtract two vectors
    public Vector2d subtract(Vector2d vec) {
        int newX = this.getXComponent() - vec.getXComponent();
        int newY = this.getYComponent() - vec.getYComponent();
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
    public Vector2d scalarMultiply(int scalar) {
        int newX = this.getXComponent() * scalar;
        int newY = this.getYComponent() * scalar;
        return new Vector2d(newX, newY);
    }

    @Override
    public String toString() {
        return "Vector from " + start + " to " + end +
                " → Components: (" + getXComponent() + ", " + getYComponent() + ")";
    }
}
