<h1 align="center">📄 Week 04 - Lab Task</h1>

<h2 align="center">🟢 CUDDLY TOYS</h2>

---

## Problem Statement

A toy manufacturer makes cuddly toys of four types in three sizes. Some toys are teddy bears, and some are bunny rabbits. 
Blue teddy bears are dressed as engine drivers. and red ones as gardeners. 
White bunnies are dressed as clowns, and black ones as bank managers. 
Teddies make a growling noise, whereas bunny rabbits squeak. All toys can say what job they do, what their colour is and what size they are.

Model the classes as described above in a hierarchy, the highest level of which should be the base class 'Cuddly Toy'. 
'There should be, an intermediate level of classes Teddy' and 'Bunny', and at the lowest level classes of 'engine driver, 'gardener', 'clown' and 'bank manager'. 
Instantiate objects of these classes dynamically via a base class pointer, setting the size of the toy via a parameter to the constructor. 
Use class attributes as appropriate. Demonstrate a method which wallows the toy to make a noise and tell us about itself.

---

## UML Diagram

The following diagram represents the class structure and relationships for this task:

[➡ View UML Diagram](./uml.png)

---

## Concepts Used

- Inheritance 
- Reference Type vs Object Type
- Constructor chaining 
- Type casting
- ClassCastException (ERROR)

---

## Learning Notes:

- Practiced method overriding with `toString()` for better object representation.
- Applied inheritance to extend the base Toy class (Teddy, Bunny, etc.).
- Understood how `super.toString()` reuses parent class details in child classes.
- Learned how roles (Clown, Gardener, Engine Driver, Bank Manager) can be modeled with subclasses.
- Improved understanding of polymorphism: same method (`toString`) behaves differently across classes.
- Learned reinforced OOP principles i.e., **Inheritance**, **Method overriding**, and **Code reusability**.

---

## Code Location
You can view the complete source code for this task here:  
[➡ View Week-04 Code](./code)

---

## Program Output

The screenshot below shows the program's output after successful execution:

[➡ View Program Output](./output.png)

---