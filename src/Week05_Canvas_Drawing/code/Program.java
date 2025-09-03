package Week05_Canvas_Drawing.code;

import javax.swing.*;

public class Program {

    public void run() {

        System.out.println();
        System.out.println("Welcome to the OOP demonstration using the Point class.\n");
        Canvas canvas = new Canvas();
        Pen picasso = new Pen(canvas);

        Point p1 = new Point();
        p1.set(100, 200);

        Point p2 = new Point(200, 200);
        // Add coordinates of p1 and p2; result stored in p3
        Point p3 = p1.add(p2);

        // Equivalent to: p3 = new Point(100 + 200, 200 + 200) → p3 = (300, 400)
        // Display the sum result and its individual coordinates

        System.out.println("P1 " + p1);
        System.out.println("P2 " + p2);

        System.out.println("P3 = P1 + P2: " + p3);
        System.out.println("X value of p3 " + p3.getX());
        System.out.println("Y value of p3: " + p3.getY());
        System.out.println();

        // Move the pen to starting position p1
        picasso.setPosition(p1);

        // Move the pen to p2 without drawing a line (just changing position)
        picasso.moveTo(p2);

        // Display the pen’s current position in console
        picasso.display();
        System.out.println();

        // Move the pen and draw lines forming a shape
        System.out.println("--- DRAWING A SQUARE ---");
        picasso.moveTo(new Point(100, 200));
        picasso.lineTo(new Point(200, 200));
        picasso.lineTo(new Point(200, 100));
        picasso.lineTo(new Point(100, 100));
        picasso.lineTo(new Point(100, 200));

        // Create a window (JFrame) to display the canvas
        JFrame frame = new JFrame("Nabeerah Yaqoot's Canvas");  // Window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close app when window closes

        frame.setSize(400, 400);    // Window dimensions
        frame.add(canvas);          // Add the Canvas object to the JFrame
        frame.setVisible(true);    // Make the window visible

        // Final confirmation message
        System.out.println("\nProgram completed successfully!");

    }

}
