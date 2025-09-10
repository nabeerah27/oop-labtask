<h1 align="center">📄 Rainy Week 11 - Lab Task</h1>

<h2 align="center">🟢 Cloning In Inheritance and Iterator </h2>

## Problem Statement

### Question 1

**Try to code class Int2 and class Int3 to capture behaviour of cloning in an inheritance hierarchy.**

### Question 2

**Draw neat, properly labelled Heap-Stack footprint on a white sheet with handwritten approach.**

### Question 3

**Justify the frequent use of type casting in given [main()](code/Main.java).**

- Java’s `Object.clone()` method always returns `Object`, 
so explicit casting is unavoidable when working with cloned objects.
- Since `ArrayList` is used without generics (`ArrayList v = new ArrayList();`), it stores elements as Object. 
Whenever you fetch an element (`v.get(i)` or `e.next()`), you must cast it back to `Int2` to access its methods.
- Casting ensures the compiler knows which class’s methods you want to call (`increment()`, `clone()`, etc.). 
Otherwise, you’d only have access to `Object` methods.

### Question 4

**Justify the use of `Iterator` based loop in given [main()](code/Main.java). 
Can we replaced it with traditional `for` loop, why or why not?** 

- `Iterator` is used because it provides generic way to traverse any `Collection`(like `ArrayList`, `LinkedList`, `HahsSet`)
without knowing it's internal structure (and allows safe element removal during iteration.
- In this code, we can replace it with traditional `for` loop since we are 
working with an `ArrayList` (index-based access is sufficient). 

```
    for (int i = 0; i < v2.size(); i++) {
        ((Int2) v2.get(i)).increment();
    }
```

### Question 5

**Why we did not override `clone()` in class `Int3`. Justify.** 

We did not override clone() in Int3 because:
1. The `clone()` defined in `Int2` is inherited by `Int3` and works correctly.
2. `Object.clone()` (called through `super.clone()`) already duplicates all 
   fields in the object, including subclass fields like `j`.
3. Since `Int3` only contains primitive fields, no additional deep copy logic is required.
4. Overriding `clone()` in `Int3` would be redundant unless `Int3` 
   introduced reference-type fields needing special cloning.

### Question 6

**There are 4 clone calls in given [main()](code/Main.java) does each call justify the concept of deep copy?**

*Clone # 01* 

```
Int2 x = new Int2(10);
Int2 x2 = (Int2) x.clone();
```

`Int2` only has a primitive variable `int i`. Shallow copy = deep copy 
for primitives. After cloning, changing `x2` does not affect `x`.

*Clone # 02* 

```
Int3 x3 = new Int3(7);
x3 = (Int3) x3.clone();
```

`Int3` inherits `int i` from `Int2` and adds primitive `int j`. Both are 
primitives → shallow copy works fine. So cloning duplicates both `i` and `j`.

*Clone # 03* 

```
ArrayList v2 = (ArrayList) v.clone();
```

`ArrayList.clone()` creates a new `ArrayList` object, but it only copies references of elements from `v` to `v2`.
At this point, both `v` and `v2` point to the same `Int2` objects inside.
So, increment in an element of `v2`, would also make changes in `v`.

*Clone # 04*

```
for (int i = 0; i < v.size(); i++) {
    v2.set(i, ((Int2) v2.get(i)).clone());
}
```

Each element in `v2` is replaced by a separately cloned `Int2` object.
So `v2` has its own independent copies of `Int2`.
Incrementing elements of `v2` does not affect elements in `v`.
It justifies the actual concept of deep copy, because it creates new 
independent objects for every element in the collection.

--- 

## UML Diagram

The UML diagram representing the class structure of this task:

[➡ View UML Diagram](./uml.png)

---

## Concepts Used


--- 

## Learning Notes


---

## Code Location

You can view the complete source code for this task here:

[➡ View Week-11 Code](code)

---

## Program Output

Sample console output demonstrating the program’s functionality:

[➡ View Program Output](./output.png)

---
