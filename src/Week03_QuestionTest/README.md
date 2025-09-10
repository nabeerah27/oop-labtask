<h1 align="center">📄 Week 03 - Lab Task</h1>

<h2 align="center">🟢 QUESTION TEST</h2>

## Question 1a 
What will happen if you compile / run this code?

    public class Q1a {
        public void run(int count) {
            System.out.println("I am sab because count is " + count);
            count--;

            if(count > 0)
                run(count);     // this is line number 6

            System.out.println("I am happy because count is " + count);
        }

        public static void main(String[] args) {
            Q1a q1a = new Q1a();
            q1a.run(2);
        }
    }
---

### Options 
    A) Compilation error at line 6  
    B) Runtime exception at line 6  
    C) Prints:
        I am sad because count is 2
        I am happy because count is 1
    D) Prints:
        I am sad because count is 2
        I am sad because count is 1
        I am happy because count is 0
        I am happy because count is 1
---

### Answer
**Option D** 

---

### Explanation 

- The code compiles successfully (no syntax errors).
- No runtime exception occurs.
- Option C is incomplete, because recursion prints additional lines.
- With input 2:
    - First call prints "sad 2", then recurses with 1. 
    - Second call prints "sad 1", stops recursion, prints "happy 0". 
    - Control returns to first call → prints "happy 1".
- Output matches Option D.
---

### Concepts Used 
- Recursion in methods
- Stack execution flow
- Base case condition
- Printing before & after recursion
--- 

### Code Location

You can view the complete source code for this task here:    
[View Week-03 Q1a Code](code/Q1a.java)

---

## Question 1b 
The following code will give

    public class Q1b {

        public static void main(String[] args) {

            String s1 = "127";
            String s2 = new String("127");

            if(s1 == s2)
                System.out.println("True");
            else
                System.out.println("False");

        }
    }
---

### Options 

    A) Compilation error, s1 == s2 is not legal for String  
    B) Prints "True"  
    C) Prints "False"
---

### Answer 
 **Option C**

---

### Explanation

In Java, the `==` operator compares object references, not content. 
Here, `s1` points to the String pool object, while `s2` refers to a new object in the heap. 
Since both references point to different objects, the condition evaluates to `false`, and the output is **False**. 

---

### Concepts Used 
- String Pool (interned strings vs. new String())
- Object Reference Comparison (`==`)
- Heap vs String Constant Pool
---

### Code Location 

The complete source code for this question is available here:  
[➡ View Week-03 Q1b Code](code/Q1b.java)

---

## Question 1c 
What will happen if you compile / run the following code?

    public class Q1c {

        static String str1 = "main method with String[] args";
        static String str2 = "main method with int[] args";

        public static void main(String[] args) {    // this is line 4
            System.out.println(str1);
        }

        public static void main(int[] args) {      // this is line 7
            System.out.println(str2);
        }
    }
---

### Options 
    A) Duplicate method main(), compilation error at line 4.
    B) Duplicate method main(), compilation error at line 7.
    C) Prints - main method with String[] args
    D) Prints - main method with int[] args
---

### Answer 
 **Option C**

---

### Explanation 
In Java, method overloading is allowed. The two `main` methods differ in parameter type (`String[]` vs `int[]`),
so no compilation error occurs. At runtime, the JVM looks specifically for `public static void main(String[] args)`.
Hence, it executes the first `main` and prints:

    main method with String[] args
---

### Concepts Used 
- Method Overloading
- main() method as entry point
- JVM method resolution
- Static variables
---

### Code Location 

The complete source code for this question is available here:  
[➡ View Week-03 Q1c Code](code/Q1c.java)

---

## Question 1d
What will happen if you compile / run the following code?

    public class Q1d {
        int maxElements;    // this is line 2

        public Q1d() {
            maxElements = 100;
            System.out.println(maxElements);
        }

        public Q1d(int i) {
            maxElements = i;
            System.out.println(maxElements);
        }

        public static void main(String[] args) {
            Q1d a = new Q1d(); // this is line 12
            Q1d b = new Q1d(99);
        }
    }
---

### Options
      A) Prints 100 and 999
      B) Prints 999 and 100
      C) compilation error at line 2, variable maxElemnt was not initialized
      D) compilation error at line 12
---

### Answer 
 **Option A**

---

### Explanation 
- The class `Q1d` has two constructors:
  1. **Default constructor** → sets `maxElements = 100` and prints 100.
  2. **Parameterized constructor** → sets `maxElements = i` and prints that value.
- In `main`:
  - `Q1d a = new Q1d();` → calls default constructor → prints **100**.
  - `Q1d b = new Q1d(99);` → calls parameterized constructor → prints **99**.
- So output = **100** followed by **99**.
---

### Concepts Used
- Constructor overloading
- Default vs parameterized constructors
- Instance variable initialization
- Object creation
---

### Code Location:

The complete source code for this question is available here:  
[➡ View Week-03 Q1d Code](code/Q1d.java)

---

## Question 1e
What will happen if you compile / run the following lines of code ?

    public class Q1e {
        public static void main(String[] args) {

            int[] iArray = new int[15];
            iArray.length = 10;     // this is line number 4
            System.out.println(iArray.length);
        }
    }
---

### Options 
    A) Prints 10 
    B) Prints 15 
    C) Compilation error, you can't change the length of array 
    D) Runtime ecxception at line 4
---

### Answer
 **Option B**

---

### Explanation
- Arrays in Java have a fixed length once created.
- The length property of an array is final, it cannot be changed.
- Uncommenting line 4 would cause a compilation error.
- Since line 4 is commented, the code simply prints the size of the array which is 15.
---

### Concepts Used
- Array declaration and initialization
- Array length property
- Final property of arrays
---

### Code Location:

This file contains the corrected working code for this question:   
[➡ View Week-03 Q1e Code](code/Q1e.java)

---

## Question 1f
What will be the output by the following code ? 

    public class Q1f {
        public static void main(String[] args) {

            int i;
            int j;

            for (i = 2; i < 4; i++)     // Outer
            {
                for (j = 0; j < 3; j++)     // Inner
                {
                    if(i == 2)
                        continue;
                    System.out.println("Value n for i = " + i + "Value for j = " + j);
                }
            }
        }
    }
---

### Options
    A) Value for i = 1 Value for j = 2
    B) Value for i = 3 Value for j = 1
    C) Value for i = 3 Value for j = 2
    D) Value for i = 3 Value for j = 1
       Value for i = 3 Value for j = 2
--- 

### Answer 
 **Option D**

---
### Explanation 
- The outer loop runs with i = 2 and i = 3 (since i < 4).
- When i = 2 → The `continue` skips all inner loop prints, so nothing prints.
- When i = 3 → The condition `if(i == 2)` is false, so inner loop executes fully.
- Inner loop runs j = 0, 1, 2 → printing 3 lines with i = 3.
- Hence, only values with i = 3 are displayed.
--- 

### Concepts Used 
- Nested for loops
- Continue statement
- Conditional execution
- Loop control flow
---

### Code Location 

The complete source code for this question is available here:  
[➡ View Week-03 Q1f Code](code/Q1f.java)

---

## Question 1g
If you run the code below, what gets printed out ?

    public class Q1g {
        public static void main(String[] args) {

            String s = new String("Toyota Bicycle");
            int iBegin = 1;
            int iEnd = 3;
            System.out.println(s.substring(iBegin, iEnd));
        }
    }
---

### Options
    A) oy 
    B) yo 
    C) yota 
    D) oyo
--- 

### Answer
**Option A**

---
### Explanation
- The string is "Toyota Bicycle"
- Substring(1, 3) → includes characters from index 1 up to (3-1). 
- Indexing:
  - T (0), o (1), y (2), o (3), t (4), a (5) ...
- So characters at index 1 and 2 are "o" and "y".
- Therefore, the result is "oy".
---

### Concepts Used
- String class
- substring(beginIndex, endIndex) method
- Zero-based indexing in Java
---

### Code Location

The complete source code for this question is available here:  
[➡ View Week-03 Q1g Code](code/Q1g.java)

---

## Question 1h
Given the following code what will be output? 

    public class Q1h {
        static int j = 40;

        public static void main(String[] args) {

            int i = 10;
            Q1h p = new Q1h();
            p.amethod(i);
            System.out.print(i + " and ");
            System.out.println(j);
        }

        public void amethod(int x) {

            x = x * x;
            j = j * x;
        }
    }
---

### Options
    A) Error : amethod does not contain varaible j 
    B) 10 and 40 
    C) 10 and 4000 
    D) 10 and 20
--- 

### Answer
**Option C**

---
### Explanation
- `i = 10` is passed into `amethod()`, but Java is **pass by value**, so the original `i` in `main` stays `10`.
- Inside `amethod`: `x = x * x = 10 * 10 = 100`.
- `j = j * x = 40 * 100 = 4000`.
- Back in `main`, printing gives: `10 and 4000`.
--- 

### Concepts Used
- Static variable
- Instance method
- Parameter passing in Java (pass by value)
- Local variable scope
- Method call and execution flow
---

### Code Location

The complete source code for this question is available here:  
[➡ View Week-03 Q1h Code](code/Q1h.java)

---

## Question 1g
What code placed before the comment // Start For loop would result in the
population of every element of the array ia[] with a value from variable i?

     public class Q1i {
        public static void main(String[] args) {
            Q1i l = new Q1i();
            l.amethod();
        }

        public void amethod() {
            int ia[] = new int[4];

            // Start of for loop
            {
                ia[i] = i;
                System.out.println(ia[i]);
            }
        }
     }
---

### Options
    A) for(int i = 0; i < ia.length - 1; i++)
    B) for(int i = 0; i < ia.length(); i++)
    C) for(int i = 1; i < 4; i++)
    D) for(int i = 0; i < ia.length; i++)
--- 

### Answer
**Option D**

---
### Explanation
- Option A only runs until length-1, so the last element of the array is skipped.
- Option B is invalid because arrays in Java use `length` (a field), not `length()` (a method).
- Option C starts at index 1, leaving index 0 uninitialized.
- Option D correctly initializes every element of the array from index 0 to 3,
  which is the valid range for an array of size 4.
---

### Concepts Used
- Java arrays
- For loop
- Array indexing and length property
---

### Code Location

This file contains the corrected working code for this question:  
[➡ View Week-03 Q1i Code](code/Q1i.java)

---

## Question 1j 

What will be the result when you attempt to compile the program?

    public class Q1j {
        public static void main(String[] args) {
            double iRand; 
            iRand = Math.random();
            System.out.println(iRand * 100);
        }
    }
---

### Options
    A) A random number between 0 and 10
    B) A random number between 0 and 100
    C) A random number between 0 and 1
    D) A compile time error about random being an unrecognised method
---

### Answer 
 **Option B** 

---

### Explanation 
- `Math.random()` returns a random double value between **0.0 (inclusive)** and **1.0 (exclusive)**.
- Multiplying it by 100 shifts the range to **0.0 (inclusive) → 100.0 (exclusive)**.
- Hence, the correct output is a random number between 0 and 100.
---

### Concepts Used 
- Math class
- Math.random() method
- Multiplication with random values

### Code Location

The complete source code for this question is available here:  
[➡ View Week-03 Q1j Code](code/Q1j.java)

---

## Question 1k

What will happen when you compile and run the following code?

    public class Q1k {
        private static int i;

        public static void main(String[] args) {
            Q1k s = new Q1k();
            s.amethod();
        }   // End of main 

        public static void amethod() {
            System.out.print(i);
        }   // End of amethod 

    }   // End of class
---

### Options 
    A) A value of 0 will be printed
    B) Nothing will be printed
    C) A runtime exception will be thrown
    D) A compile time error complaining of the scope of the variable i
---

### Answer 
 **Option A**

---

### Explanation 
- The variable `i` is declared as `private static int i;`.
- Static numeric variables in Java are initialized to **default values**.
- Since `i` is an `int`, its default value is **0**.
- The method `amethod()` prints the value of `i`, so `0` will be printed.
- Therefore, the correct answer is **A**.
---

### Concepts used 
- Access Modifier: private
- Static Variable
- Default Value of Data Types (int = 0)
- Static method call 
---

### Code Location

The complete source code for this question is available here:  
[➡ View Week-03 Q1k Code](code/Q1k.java)

---

## Question 1l 
What will happen when you attempt to compile and run the following code?

    public class Q1l {

        public static void main(String[] args) {

            Q1l o = new Q1l();
            int iBase = 0;
            o.amethod(iBase);
        }

        public void amethod(int iOver) {
            System.out.println("Over.amethod");
        }
    }

    class BaseL {
        private void amethod(int iBase) {
            System.out.println("BaseL.amethod");
        }
    }
---

### Options 
    A) Compile time error complaining the BaseL.amethod is private
    B) Runtime error complaining that BaseL.amethod is private
    C) Output of "BaseL.amethod"
    D) Output of "Over.amethod"
---

### Answer 
 **Option D**

---

### Explanation 
- `Q1l` class has a public method `amethod(int iOver)`.
- `Base` class has a private method `amethod(int iBase)` which is not visible outside `Base`.
- `Q1l` does not extend `Base` in this code, so `Base`’s method is irrelevant.
- The call `o.amethod(iBase)` invokes `Q1l`'s method.
- Hence, the output will be: "Over.amethod".
---

### Concepts Used
- Method Visibility (private vs public)
- Method Overloading
- Method Call Resolution
---

### Code Location

The complete source code for this question is available here:  
[➡ View Week-03 Q1l Code](code/Q1l.java)

---

## Question 1m
What will happen when you attempt to compile and run the following code?

    public class Q1m {

        public static void main(String[] args) {
            Q1m q1m = new Q1m();
            q1m.amethod();
        }

        public void amethod() {
            int k = 10;

            switch(k) {

                default:  // Put the default at the bottom, not here
                    System.out.println("This is the default output");
                    break;

                case 10:
                    System.out.print("Ten ");

                case 20:
                    System.out.println("Twenty");
                    break;
            }
        }
    }
---

### Options 
    A) Compile and run with output "Ten "
    B) Compile and run with output "Ten Twenty"
    C) Compile and run with output "This is the default output"
    D) Compile and run with output "Twenty"
---

### Answer 
 **Option B**

---

### Explanation 
- In the switch statement for variable k, `case 10:` matches.
- Java switch statements **fall through** unless a `break` is used.
- There is **no break** after `case 10`, so it continues to `case 20`.
- `case 20:` prints "Twenty" and then encounters a break.
- The `default` is not executed because a matching case was found.
- Therefore, output is: "Ten Twenty".
---

### Concepts Used
- Switch statement and case matching 
- Fall-through behavior in switch
- Break statement
---

### Code Location

The complete source code for this question is available here:  
[➡ View Week-03 Q1m Code](code/Q1m.java)

---

## Question 1n
Given the following code, which of the following, if inserted at the comment // Here,
will allow the code to compile and run without error?

    public class Q1n extends BaseN {

        static boolean b1 = false;
        static int i = -1;
        static double d = 10.1;

        public static void main(String[] args) {
            Q1n m = new Q1n();
            BaseN b = new BaseN();

            // Here
        }
    }

    class BaseN { }
---

### Options
    A) b = m;
    B) m = b; 
    C) i = d; 
    D) b1 = i; 
---

### Answer 
 **Options A**

---

### Explanation 
- Option A) b = m; 
- `Q1n` is a subclass of `BaseN`, so a reference of type `BaseN` (i.e., b) can hold an object of type `Q1n`.
- This is **upcasting**, allowed in Java automatically.
- Option B) m = b; 
  - You cannot assign a `BaseN` reference to a `Q1n` variable without explicit casting (downcasting).
- Option C) i = d; 
  - You cannot assign a double to an int without explicit casting.
- Option D) b1 = i; 
  - Cannot assign int to boolean in Java.
---

### Concepts Used
- Inheritance (Q1n extends BaseN)
- Upcasting and Downcasting 
- Type compatibility
- Primitive type assignment rules
---

### Code Location

This file contains the corrected working code for this question:  
[➡ View Week-03 Q1n Code](code/Q1n.java)

---

## Question 1o
When the following class definition, which of the following can be legally placed
after the comment line // Here?

    public class Q1o extends BaseO {

        public static void main(String[] args) {
            Q1o m = new Q1o(10); 
        }

        Q1o(int i) {
            super(i); 
        }

        Q1o(String s, int i) {
            this(i);
            // Here 
        }
    }

    class BaseO {
        public BaseO(int i) { }
    }
---

### Options 
    A) Q1o m = new Q1o(); 
    B) super(); 
    C) this("Hello", 10); 
    D) BaseO b = new BaseO(10); 
---

### Answer
 **Option D**

---

### Explanation 
- Option A) 
- Cannot create a local variable `m` inside a constructor with `new Q1o()`; it would require a no-arg constructor which does not exist.
- Option B) 
  - `super()` must be the first statement in a constructor. Here `this(i)` is already first, so `super()` is illegal.
- Option C) 
  - `this("Hello", 10)` would call the same constructor recursively → compile-time error (cannot call `this()` after another `this()` call).
- Option D) 
  - Declaring a new object of type `BaseO` with `new BaseO(10)` is legal inside the constructor.
  - You can create local objects freely after constructor calls.
---

### Concepts Used
- Inheritance
- Constructor chaining (`this()` and `super()`)
- Rules for constructor calls (first statement)
---

### Code Location

This file contains the corrected working code for this question:  
[➡ View Week-03 Q1o Code](code/Q1o.java)

---

## Question 1p
Given the following class definition, which of the following statements would be legal
after the comment // Here?

    public class Q1p {
        
        String s = new String("Between"); 
        
        public void amethod(final int iArgs) {
            int iam;
            
            class Bicycle {
                
                public void sayHello() {
                    int iOther;
                }   // End of Bicycle class 
            }
        }   // End of amethod 
        
        public void another() {
            // Here 
        }
    }
---

### Options 
    A) Bicycle b = new Bicycle();
    B) System.out.println(s);
    C) System.out.println(iOther);
    D) System.out.println(iam);
---

### Answer 
 **Option B**

---

### Explanation 
- *Option A* : `Bicycle` is a **local inner class** defined inside `amethod()` and is **not visible** outside that method. Cannot be used in `another()`.
- *Option B* : `s` is an **instance variable** of the class, so it can be accessed in any non-static method like `another()`.
- *Option C* : `iOther` is a local variable inside `sayHello()`; it is **not visible** outside that method.
- *Option D* : `iam` is a local variable inside `amethod()`; it is **not visible** in `another()`.
---

### Concepts Used 
- Local inner classes
- Instance variables vs local variables
- Variable scope in Java
- Accessing instance variables inside class methods
---

### Code Location

This file contains the corrected working code for this question:  
[➡ View Week-03 Q1p Code](code/Q1p.java)

---
