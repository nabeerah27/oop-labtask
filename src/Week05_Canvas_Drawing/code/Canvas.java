package Week05_Canvas_Drawing.code;

import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

// Canvas class extends JPanel to create a custom drawing area
public class Canvas extends JPanel {

    // List to store all the lines drawn on the canvas
    private List<Line> lines = new ArrayList<>();

    public void addLine(Point p1, Point p2) {

        // Create a new Line object and store it in the list
        lines.add(new Line(p1,p2));

        // Message to show the line's coordinates in the console
        System.out.println("Line from (" + p1.getX() + " , " + p1.getY() +
                                ") to (" + p2.getX() + " , " + p2.getY() + ")");

        // Triggers the panel to repaint itself, which calls paintComponent()
        repaint();
    }

    // Custom painting method called automatically whenever the panel needs to be redrawn.
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        // Draw all lines stored in the list

        for (Line line : lines)
        {
            g.drawLine(line.start.getX(), line.start.getY(), line.end.getX(), line.end.getY());
        }
    }
}
