<h1 align="center">📄 Week 10 - Lab Task</h1>

<h2 align="center">🟢 REVISION </h2>

## Problem Statement

### Stand-alone classes : 
1. class Point2d
2. class Vector2d
3. class Rational Number
4. class Complex Number
5. class Range 
6. class Triangle 

### Question 1:
What is the commonality observed among class `Point2d`, class `Vector2d`, class `RationalNumber`, and class `ComplexNumber`. 

**Ans:** All these classes have two primitive instance variables that store the essential numeric data of the object.
- `Point2d`: x and y coordinates 
- `Vector2d`: x and y components 
- `RationalNumber`: numerator and denominator 
- `ComplexNumber`: real and imaginary parts

### Question 2: 
Implement class `Vector2d` using primitive data type, composition, and inheritance.

*Implementation of Vector2d:* The implementation code for Vector2d is available in the Code folder under [Vector2d](code/Vector2d)

**Primitive Data Types:** 
The `Vector2d` class uses two primitive variables, x and y of double types, to represent the vector components.

**Inheritance:**
`Vector2d` extends `Point` class (base class) that also has x and y of double type. This demonstrates inheritance, reusing the common structure and behavior.

**Composition:**
Inside `Vector2d`, the instances of `Point` class can be included. This shows composition, where a class contains objects of another class to extend its behavior.

### Question 3: 
What is the difference between class `Vector2d` utilizing primitive data type 
and class `Vector2d` created using points. 

| Aspect                    | Primitive-based `Vector2d`                           | Point-based `Vector2d` (Composition)                              |
| ------------------------- | ---------------------------------------------------- |-------------------------------------------------------------------|
| **Representation**        | Stores as two primitive fields: `double x, double y` | Stores as two `Point` objects: `start`, `end`                     |
| **Simplicity**            | Lightweight, directly manipulates numbers            | Slightly heavier (extra objects) but more expressive              |
| **Flexibility**           | Limited to vectors only                              | Can represent displacement between any two points                 |
| **Reusability**           | Low – every operation must handle raw `x`, `y`       | Medium – leverages `Point` objects to represent geometry cleanly  |
| **Immutability & Safety** | Safe (primitives copied by value)                    | Needs deep copy to avoid shared references                        |
| **Readability**           | Simple `(x, y)` representation                       | More semantic: “Vector from Point A to Point B”                   |
| **Use Case**              | Best for pure mathematical computations              | Better for geometry-based tasks (graphics, physics, displacement) |


### Question 4: 
Provide definition of method `dotProduct()` inside class `Vector2d` (primitive data type) and 
write `main` function in driver class to demonstrate successful execution.

*In `Vector2d` class*

```
public double dotProduct(Vector2d vec) {
    return (this.getX() * vec.getX() + this.getY() * vec.getY());
}
```

*In `Program` (Driver) class*

```
Vector2d vec1 = new Vector2d(3, 4);
Vector2d vec2 = new Vector2d(1, 8);
System.out.println("Dot Product = " + vec1.dotProduct(vec2);); // Output: 35.0
```

### Question 5: 
Provide definition of method `dotProduct()` inside class `Vector2d` (composition) and
write `main` function in driver class to demonstrate successful execution.

*In `Vector2d` class*

```
public int dotProduct(Vector2d vec) {
      int xPart = this.getXComponent() * vec.getXComponent();
      int yPart = this.getYComponent() * vec.getYComponent();
      return xPart + yPart;
}
```

*In `Program` (Driver) class*

```
Vector2d vec1 = new Vector2d(1, 2);
Vector2d vec2 = new Vector2d(4, 6);
System.out.println("Dot Product = " + vec1.dotProduct(vec2);); // Output: 29.0
```

### Question 6: 
What are the extra requirements or functionalities that you need to implement inside class `RationalNumber`? 
Demonstrate Rational number testing inside `Main` class.

*Extra Functionalities:*

- Validation of denominator: Denominator must not be zero.
- Simplification of fractions: Always reduce fractions to the simplest form using `gcd().`
- Sign handling: Denominator should always be positive.
- Implementation code can be seen in: [RationalNumber.java](code/Rational_Number/RationalNumber.java)

*Testing in Main Class:*

- Create RationalNumber objects
- Perform addition, subtraction, multiplication, and division
- Display results in simplified form
- Testing code can be seen in: [Program.java](code/Rational_Number/Program.java)

---

## UML Diagrams

Below are the UML representations for `Vector2d` (primitive, composition, inheritance) and `RationalNumber`:

- [UML - Vector2d](code/Vector2d/vector2d_uml.png)
- [UML - Rational Number](code/Rational_Number/rational_uml.png)

## Code References 

- Vector2d (Primitive-based) → [Vector2d - Primitive](code/Vector2d/primitive)
- Vector2d (Composition-based) → [Vector2d - Composition](code/Vector2d/composition)
- Vector2d (Inheritance-based) → [Vector2d - Inheritance](code/Vector2d/inheritance)
- RationalNumber → [RationalNumber](code/Rational_Number) 

## Program Output 

The following screenshots show the successful execution results of `Vector2d` and `RationalNumber`:

**Vector2d**

[➡ View Vector2d Output](code/Vector2d/vector2d_output.png)

**RationalNumber**

[➡ View Rational Number Output](code/Rational_Number/rational_output.png)
