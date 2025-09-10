<h1 align="center">📄 Week 05 - Lab Task</h1>

<h2 align="center">🟢 CANVAS DRAWING</h2>

---

## UML Diagram

The following diagram represents the class structure and relationships for this task:  

[➡ View UML Diagram](uml.png)

---

## Concepts Used

- Inheritance 
- Composition
- Encapsulation 
- Method overriding
- Event-driven GUI concepts from Swing.

---

## Learning Notes

- Used `JPanel` (via the `Canvas` class) to create a custom drawing area and override `paintComponent(Graphics g)` for rendering shapes.
- Integrated `JFrame` from Swing to display the custom panel on a window.
- Learned the importance of calling `super.paintComponent(g)` to clear the background before redrawing.
- Implemented dynamic storage of drawable objects using ArrayList<Line>.
- Applied composition:
  - `Line` contains two `Point` objects.
  - `Canvas` contains multiple `Line` objects.
  - `Pen` interacts with `Canvas` to draw lines.
- Practiced working with custom classes (`Point`, `Line`, `Pen`, `Canvas`) in a structured, object-oriented design.
- Applied method chaining concepts like `moveTo()` and `lineTo()` for sequential drawing operations.

---

## Code Location

You can view the complete source code for this task here:  

[➡ View Week-05 Code](code)

---

## Program Output

When executed:

- A window appears displaying the drawn shape (square).

[➡ View Window Output](window_output.png)

- The console shows point operations and pen movements.

[➡ View Console Output](console_output.png)

--- 