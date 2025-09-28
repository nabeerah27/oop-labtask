<h1 align="center">📄 Week 12 - Lab Task</h1>

<h2 align="center">🟢 MONEY CHANGER (Pakistani Currency) </h2>

## 📌 Problem Statement 

Write a Java program that can "make change". Your program should take two numbers as input,
one that is a monetary amount charged and the other that is a monetary amount given. 
It should then return the number of each kind of bill and coin to give back as change for the 
difference between the amount given and the amount charged. The values assigned to the bills 
and coins can be based on the monetary system of any current or former government.
Try to design your program so that it returns as few bills and coins as possible.

---

## Questions

1. What is the input and output in the Money Changer program?
2. Draw UML and Block Diagram.
3. How do you identify encapsulation in your program?
4. Which algorithm have you used to build logic for making change?
5. Which data structure have you used in the application?
6. Can we write a program which allows us to use multiple data structures to solve the same problem within the same class?
If yes, which OOP feature will help you most?

---

## ⚙️ How It Works

1. Cashier Setup
- User enters cashier’s name.
- Cashier is initialized with a stock of Pakistani currency notes/coins.

2. Customer Setup
- User enters customer’s name and starting balance.

3. Billing Process
- Cashier generates and prints the shop bill for the customer.
- Customer decides how much to pay.

4. Payment Validation
- If payment < bill → rejected.
- If payment = bill → accepted, no change required.
- If payment > bill → program calculates change.

5. Change Calculation
- User chooses a method:
  - `Array Version`: Change is returned using arrays.
  - `LinkedHashMap Version`: Change is returned using key-value pairs.
- Payment is first added to cashier’s stock, then change is deducted.
- If cashier cannot provide exact change, the full payment is returned to the customer.

6. Stock Update
- After a successful transaction, the cashier’s stock is updated.

---

## 🏦 Currency Denominations Used

The program is based on the Pakistani currency system, which includes both notes and coins:

**Notes:** 5000, 1000, 500, 100, 50, 20, 10

**Coins:** 5, 2, 1

---

## 🧩 UML & Block Diagram

Below is the UML diagram of the class structure along with a block diagram showing 
the system’s workflow (Cashier–Customer interaction). 

[➡ View UML Diagram](uml.png)

[➡ View Block Diagram](block_diagram.png)

---

## 📚 Concepts Used

- **Encapsulation**: Private fields for `bill`, `balance`, and `payment`.
- **Inheritance**: Cashier and Customer extend Person.
- **Greedy Algorithm**: Change is returned using the largest possible denominations first 
  (ensuring minimum number of denominations are returned). 
- **Conditional logic**: Validation for less, exact, or more money.
- **Array & HashMap**: Two different `makeChange()` methods to manage and return the change. 
- **Simulation of Real Stock**: Payment is first added to cashier’s stock before calculating change.
- **Method Decomposition**: Separate methods for bill creation, payment handling, change calculation, and stock display.

---

## 📝 Learning notes

- Learned to model real-world cashier–customer interaction using OOP.
- Understood how payment affects stock before returning change.
- Practiced applying **Greedy Algorithm** in real-world currency distribution with both arrays and `LinkedHashMap`.
- Strengthened skills in object-oriented programming with encapsulated fields, reusable methods, and inheritance.
- Improved skills in formatted console outputs for bill printing and stock display.
- Validated the importance of data validation (e.g., insufficient money or exact payment cases).

---

## 👨‍💻 Code Location

You can view the complete source code for this task here:

[➡ View Week-12 Code](code)

---

## 🖥️ Example Run

```
Enter uncle's name: Jawad 
Uncle's Current Stock: 
5000x2 | 1000x3 | 500x5 | 100x10 | 50x10 | 20x10 | 10x20 | 5x20 | 2x30 | 1x100 | 
Enter khareedar's name: Sajafa 
Enter Sajafa's starting balance: 7000 

🛒 Welcome to the Shop! 
Enter total bill amount: 1212 

========== 🧾 SHOP BILL ========== 
Cashier      : Jawad 
Customer     : Sajafa 
Total Bill   : Rs. 1212 
===================================

Enter how much Sajafa pays: 4545 
Payment received Rs. 4545. Return the change Rs. 3333

Choose change method: 
1. Array version 
2. HashMap version 
Enter your choice: 1 
Change to return Rs. 3333 

Change returned as: 
1000 x 3 
100 x 3 
20 x 1 
10 x 1 
2 x 1 
1 x 1 

Sajafa's current balance: 5788
Uncle's Current Stock: 
5000x2 | 500x5 | 100x7 | 50x10 | 20x9 | 10x19 | 5x20 | 2x29 | 1x99 |

```

You can view additional sample outputs (for exact payment and insufficient payment cases) here:  

[➡ View More Outputs](output.png)

---