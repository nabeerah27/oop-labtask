package W5_Triangle_Scenario.code;

public class Triangle {

    // Static variable to count how many Triangle objects are created
    static int count = 0;

    // Instance variables representing the three sides of a triangle
    private double sideA;
    private double sideB;
    private double sideC;

    // Default constructor: Creates an equilateral triangle with sides 1.0
    Triangle() {
        count ++ ;
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
    }

    // One-parameter constructor: Creates an equilateral triangle with given side length
    Triangle(double x) {
        count ++ ;
        this.sideA = x;
        this.sideB = x;
        this.sideC = x;
    }

    // Two-parameter constructor: Sets first two sides equal, third side different
    Triangle(double x, double y) {
        count ++ ;
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
    }

    // Three-parameter constructor: Creates an isosceles triangle with all sides different
    Triangle(double x, double y, double z) {
        count ++ ;
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
    }

    // Copy constructor
    Triangle(Triangle other) {
        count ++ ;
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
    }


    // Combine setter for all sides
    public void set(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getters for each side
    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }

    // Returns the total number of Triangle objects created
    public int objectCount() {
        return count;
    }

    // Calculates and returns the perimeter of the triangle
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Checks if the triangle is right-angled using the Pythagorean theorem
    public boolean isRightAngled() {
        return Math.pow(sideA, 2) == Math.pow(sideB, 2) + Math.pow(sideC, 2)
                || Math.pow(sideB, 2) == Math.pow(sideA, 2) + Math.pow(sideC, 2)
                || Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2);
    }

    // Provides a string representation of the triangle's properties
    @Override
    public String toString() {
        return "Triangle has three sides: " + sideA + ", " + sideB + " and " + sideC
                + "\nPerimeter: " + perimeter()
                + "\nTriangle is right angled? " + isRightAngled()
                + "\nNumber of objects created by Triangle class: " + objectCount();
    }

}
