package W7_Vector2D.code;
import java.util.Scanner;
import java.text.DecimalFormat;

public class VectorApp {

    private Scanner sc;
    private DecimalFormat df = new DecimalFormat("#.###");  // up to 3 decimals, removes trailing zeros

    public VectorApp() {
        sc = new Scanner(System.in);
    }

    // Method to read a vector from user
    public Vector2D inputVector(String name) {
        System.out.print("Enter " + name + " (x, y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Vector2D(x, y);
    }

    // Method to display menu and perform chosen operations
    public void run() {
        System.out.println("=== Vector Operations Menu ===");

        Vector2D v1 = inputVector("Vector 1");
        Vector2D v2 = inputVector("Vector 2");

        boolean running = true;
        while (running) {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Add Vectors");
            System.out.println("2. Subtract Vectors");
            System.out.println("3. Dot Product");
            System.out.println("4. Cross Product");
            System.out.println("5. Scalar Multiplication");
            System.out.println("6. Angle Between Vectors");
            System.out.println("7. Check Perpendicular");
            System.out.println("8. Check Parallel");
            System.out.println("9. Exit");
            System.out.print("Enter choice (1-9): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Vector2D sum = Operations.add(v1, v2);
                    System.out.println("v1 + v2 = (" + df.format(sum.getX()) + ", " + df.format(sum.getY()) + ")");
                    break;

                case 2:
                    Vector2D diff = Operations.subtract(v1, v2);
                    System.out.println("v1 - v2 = (" + df.format(diff.getX()) + ", " + df.format(diff.getY()) + ")");
                    break;

                case 3:
                    System.out.println("Dot Product (v1 . v2): " + df.format(Operations.dotProduct(v1, v2)));
                    break;

                case 4:
                    System.out.println("Cross Product (v1 x v2): " + df.format(Operations.crossProduct(v1, v2)));
                    break;

                case 5:
                    System.out.print("Enter scalar value: ");
                    double scalar = sc.nextDouble();

                    Vector2D scaledV1 = Operations.scalarMultiply(scalar, v1);
                    Vector2D scaledV2 = Operations.scalarMultiply(scalar, v2);

                    System.out.println("v1 × " + df.format(scalar) + " = (" + df.format(scaledV1.getX()) + ", " + df.format(scaledV1.getY()) + ")");
                    System.out.println("v2 × " + df.format(scalar) + " = (" + df.format(scaledV2.getX()) + ", " + df.format(scaledV2.getY()) + ")");
                    break;

                case 6:
                    double angleRad = Operations.angleBetween(v1, v2);
                    double angleDeg = Math.toDegrees(angleRad);

                    System.out.println("Angle = " + df.format(angleRad) + " radians (" + df.format(angleDeg) + " degrees)");
                    break;

                case 7:
                    boolean perpendicular = Math.abs(Operations.dotProduct(v1, v2)) < 1e-10;
                    System.out.println("v1 and v2 perpendicular? " + perpendicular);
                    break;

                case 8:
                    boolean parallel = Math.abs(Operations.crossProduct(v1, v2)) < 1e-10;
                    System.out.println("v1 and v2 parallel? " + parallel);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }

}
