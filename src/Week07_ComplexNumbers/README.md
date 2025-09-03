<h1 align="center">📄 Week 07 - Lab Task</h1>

<h2 align="center">🟢 COMPLEX NUMBERS</h2>

## UML Diagram

The UML diagram representing the class structure of this task:

[➡ View UML Diagram](./uml.png)

---

## Concepts Used

- Encapsulation — Using `private` attributes and getters/setters to hide data.
- Abstraction — Hiding implementation details of complex number operations inside methods.
- Method Overriding — Overriding `toString()` to display complex numbers in standard form `(a + bi)`.
- Static Methods — Utility-like methods in `Operations` class for performing arithmetic.
- Mathematical Computation — Using `Math.pow()`, `Math.sqrt()`, and `Math.abs()` for complex number calculations.
- Composition — `Operations` class works on `ComplexNumber` objects.
- Immutability Approach — `Operations` return new `ComplexNumber` objects instead of modifying existing ones.

---

## Learning notes

- A complex number is of the form a + bi, where a is the real part and b is the imaginary part.
- Operations:
  - *Addition:* `(a + bi) + (c + di) = (a + c) + (b + d)i`
  - *Subtraction:* `(a + bi) - (c + di) = (a - c) + (b - d)i`
  - *Multiplication:* `(a + bi)(c + di) = (ac - bd) + (ad + bc)i`
  - *Division:* `(a + bi)/(c + di) = ((ac + bd) + (bc - ad)i) / (c² + d²)`
  - *Magnitude:* `|a + bi| = √(a² + b²)`
  - *Conjugate:* `a - bi`
  - *Additive inverse:* `-(a + bi) = -a - bi`
  - *Multiplicative inverse:* `1/(a+bi) = (a - bi) / (a² + b²)`
- **DecimalFormat is used to display numbers neatly, removing unnecessary .00 while keeping the type double.**
---

## Code Location

You can view the complete source code for this task here:

[➡ View Week-07 Code](./code)

---

## Program Output

Sample console output showing all operations on complex numbers.

[➡ View Program Output](./output.png)
