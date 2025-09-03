package Week05_Canvas_Drawing.code;

public class Pen {

    private Point position;
    private final Canvas cvs;

    public Pen(Canvas canvas) {
        this.cvs = canvas;
        this.position = new Point(0,0);
    }

    // Setter and getter for position
    public void setPosition(Point position) {
        this.position = position;
    }
    public Point getPosition() {
        return position;
    }

    // Function to just move the pen from one point to another
    public void moveTo(Point z) {
        System.out.println("Pen moved to " + z);
        this.position = new Point(z.getX(), z.getY());
    }

    // Function to draw line from one point to another using pen
    public void lineTo (Point z) {

        System.out.println("Drawing line from "+ position + " to " + z);
        Point startCopy = new Point(position.getX(), position.getY());
        Point endCopy = new Point(z.getX(), z.getY());

        cvs.addLine(startCopy, endCopy);
        position.set(z.getX(), z.getY());
    }

    // Function to display current position of pen
    public void display() {
        System.out.println("Pen is at (" + position.getX() + "," + position.getY() + ")");
    }

}
