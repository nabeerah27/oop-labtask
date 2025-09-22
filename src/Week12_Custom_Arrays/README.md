<h1 align="center">📄 Week 12 - Lab Task</h1>

<h2 align="center">🟢 CUSTOM ARRAYS </h2>

## 📌 Problem Statement

- Design and implement a **Custom Static Array**.
- Design and implement a **Custom Dynamic Array**.

---

<h1 align="center"> Static Custom Array (Implementation in Java) </h1>

---

## 🧩 Class Overview

The **StaticArray** class provides the following:

- *Fields:*
  - `int[] array` → internal storage for elements.
  - `int size` → current number of stored elements.
  - `int capacity` → fixed maximum capacity of the array.

- *Key Methods:*
  - `insert(int element)` → Insert element at the end (default).
  - `insert(int index, int element)` → Insert element at a specific index (shifts elements to the right).
  - `delete()` → Remove last element.
  - `delete(int index)` → Remove element at a specific index (shifts elements to the left).
  - `get(int index)` → Access element at the given index.
  - `set(int index, int element)` → Update element at the given index.
  - `isFull()` / `isEmpty()` → Check whether the array is full or empty.
  - `toString()` → Nicely prints array contents.

---

## 📚 Concepts Applied

- **Encapsulation**: Internal details (`array`, `size`, `capacity`) are private.
- **Abstraction**: Users interact through methods, not internal details.
- **Error Handling**: User-friendly messages when invalid operations occur (full array, invalid index, etc.).
- **Method Overriding**: Custom `toString()` to represent array contents.
- **DSA Fundamentals**: Shows how arrays work internally, forming the base for dynamic arrays like `ArrayList`.

---

## 📝 Learning Notes

- **Fixed Size**: Once created, capacity cannot change.
- **Shifting Elements**: Required for inserting or deleting at a specific index.
- **Validation**: Every method checks conditions (full, empty, valid index) before execution.
- **Comparison with ArrayList**: Unlike `ArrayList`, this static version does not resize itself.
- **Practical Use**: Great for learning how low-level array management works in Java.

---

## 👨‍💻 Code Location

Full implementation available here: 

[➡ View Static Array Code](static_array)

---

## 🖥️ Sample Output

The following output demonstrates a typical run of the program:

[➡ View Program Output](static_array/output.png)

---

<h1 align="center"> Dynamic Custom Array (Implementation in Java) </h1>

---

## 🧩 Class Overview

The DynamicArray class provides the following:

- *Fields:*
  - `Object[] array` → underlying storage.
  - `int size` → number of elements currently in use.
  - `int capacity` → current capacity (grows as needed).

- *Key Methods:*

  - `expandCapacity()` → Doubles the size of the array automatically when full.
  - `insert(Object obj)` → Insert element at the end (resizes if full).
  - `insert(Object obj, int index)` → Insert element at a specific index (with shifting).
  - `remove()` → Remove last element.
  - `remove(int index)` → Remove element at a specific index (with shifting).
  - `get(int index)` → Access element at given index.
  - `replace(int index, Object obj)` → Replace element at given index.
  - `sort()` → Sorts elements (works only for Comparable types).
  - `search(Object obj)` → Finds element index (supports null).
  - `isFull()` / `isEmpty()` → Check array status.
  - `getSize()` / `getCapacity()` → Get current usage details.
  - `toString()` → String representation of the array contents.

---

## 📚 Concepts Applied

- **Encapsulation**: `array`, `size`, `capacity` are private and only accessible through methods.
- **Dynamic Memory Management**: `expandCapacity()` doubles storage when full.
- **Polymorphism & Interfaces**: Sorting works only if elements implement `Comparable`.
- **Error Handling**: Graceful error messages for invalid indices or empty arrays.
- **Null Safety**: Special handling of `null` during search and sorting (nulls pushed to end).
- **Method Overriding**: Custom `toString()` provides readable output.
- **DSA Foundation**: Demonstrates internal working of Java's ArrayList.

---

## 📝 Learning Notes

- **Resizable Array**: Capacity grows automatically (usually doubles) when full.
- **Insertion & Deletion Costs**: Shifting elements makes them O(n) operations.
- **Sorting Limitation**: Only works for `Comparable` objects like String or Integer.
- **Null Handling**: `Null` values supported in search, pushed to end in sort.
- **Practical Insight**: Helps understand how dynamic collections like `ArrayList` work internally.

---

## 👨‍💻 Code Location

Full source code and main program for testing dynamic array operations:

[➡ View Dynamic Array Code](dynamic_array)

---

## 🖥️ Sample Output

Example output demonstrating methods of the class: 

[➡ View Program Output](dynamic_array/output.png)


