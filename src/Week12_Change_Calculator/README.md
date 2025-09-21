<h1 align="center">📄 Week 12 - Lab Task</h1>

<h2 align="center">🟢 CHANGE CALCULATOR (Pakistani Currency) </h2>

## 📌 Problem Statement 

Write a Java program that can "make change". Your program should take two numbers as input,
one that is a monetary amount charged and the other that is a monetary amount given. 
It should then return the number of each kind of bill and coin to give back as change for the 
difference between the amount given and the amount charged. The values assigned to the bills 
and coins can be based on the monetary system of any current or former government.
Try to design your program so that it returns as few bills and coins as possible.

---

## ⚙️ How It Works

1. User enters the **charged amount** and the **given amount**.
2. Program checks:
    - If given amount < charged amount → insufficient money.
    - If given amount = charged amount → no change needed.
    - If given amount > charged amount → calculate change.
3. Change is calculated using **Greedy Algorithm**:
    - Start with the largest note (5000) and work down to the smallest coin (1).
    - Always pick as many of the largest possible denomination.
    - Subtract from the remaining change until it reaches 0.
4. Results are stored in a `LinkedHashMap` (to maintain order).
5. The program outputs a **structured breakdown** of notes and coins separately.
   If there are **no notes** or **no coins**, that section will be skipped in the output.

---

## 🏦 Currency Denominations Used

- **Notes:** 5000, 1000, 500, 100, 50, 20, 10
- **Coins:** 5, 2, 1

---

## 🧩 UML Diagram

The UML diagram representing the class structure of this task:

[➡ View UML Diagram](uml.png)

---

## 📚 Concepts Used

- Encapsulation — private fields for `chargedAmount`, `givenAmount`, and `totalChange`.
- Conditional logic — validation for less, exact, or more money.
- Greedy Algorithm — ensuring minimum number of notes and coins are returned.
- Data structures — `LinkedHashMap` to store denominations in order.
- Method decomposition — separate methods for input, validation, computation, and display.
- Method overriding — `toString()` to generate a structured breakdown of notes and coins.

---

## 📝 Learning notes

- Practiced applying **Greedy Algorithm** in real-world currency distribution.
- Reinforced the concept of maps `(LinkedHashMap)` for storing denomination-to-count mappings.
- Improved understanding of method responsibilities by dividing input, validation, and computation.
- Strengthened skills in object-oriented programming with encapsulated fields and reusable methods.
- Gained experience in user-friendly output formatting by separating notes and coins clearly.
- Validated the importance of data validation (e.g., insufficient money or exact payment cases).

---

## 👨‍💻 Code Location

You can view the complete source code for this task here:

[➡ View Week-12 Code](code)

---

## 🖥️ Example Run

```
Enter charged amount: 1212
Enter given amount: 4545
Customer has given more amount. Return the change.

Notes:
3 x 1000
3 x 100
1 x 20
1 x 10
Coins:
1 x 2
1 x 1
```

You can view additional sample outputs (for exact payment and insufficient payment cases) here:  

[➡ View More Outputs](output.png)

---