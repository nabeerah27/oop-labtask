package W5_Canvas_Drawing.code;

public class Point {

    // Private attributes
    private int x;
    private int y;

    // Default constructor that set coordinates as 0
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Parameterized constructor
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    // Setter for both points
    public void set(int x,int y){
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY(){
        return y;
    }

    // Function to add two points; returns the resultant point
    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    // Function to subtract two points; returns the resultant point
    public Point subtract(Point other) {
        return new Point(this.x - other.x, this.y - other.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
