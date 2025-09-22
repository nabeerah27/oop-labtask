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
    - `int[] array` → stores elements.
    - `int size` → current number of elements.
    - `int capacity` → maximum allowed elements.

- *Key Methods:*
    - `addLast(int element)` → Insert element at the end.
    - `addAt(int index, int element)` → Insert at a given index (with shifting).
    - `deleteAt(int index)` → Remove element at a given index.
    - `get(int index)` → Access element at a given index.
    - `set(int index, int element)` → Update element at a given index.
    - `isFull()` / `isEmpty()` → Check array status.
    - `toString()` → Custom string representation of array contents.

---

## 📚 Concepts Applied

- Encapsulation: `array`, `size`, `capacity` are private.
- Abstraction: Users only see methods; implementation details are hidden.
- Error Handling: Graceful error messages on invalid operations.
- Method Overriding: `toString()` customized for readability.
- DSA Foundations: Mimics low-level implementation of arrays and helps in understanding how `ArrayList` is built internally.

---

## 📝 Learning Notes

- **Fixed Size** → Capacity cannot change once defined.
- **Shifting Elements** → Required in insertions and deletions (O(n) operations).
- **Comparison to ArrayList** → `ArrayList` extends this by making the array dynamic (resizable).
- **Validation** → Each operation checks for valid indices or capacity before execution.

---

## 👨‍💻 Code Location

Full implementation available here: 

[➡ View Static Array Code](static_array)

---

## 🖥️ Sample Output

The following output demonstrates a typical run of the program:

[➡ View Program Output](static_array/output.png)

🧩 Class Overview

The DynamicArray class provides the following:

- *Fields:*
  - `Object[]` array → underlying storage.
  - int `size` → number of elements currently in use.
  - int `capacity` → current capacity (grows as needed).

-*Key Methods:*
  - `add(Object element)` → Add element at the end (resizes if full).
  - `add(int index, Object element)` → Insert element at a given index with shifting.
  - `remove(int index)` → Remove element at a given index.
  - `search(Object object)` → Search for an element (supports null).
  - `get(int index)` / set(int index, Object element) → Access or update elements.
  - `sort()` → Sorts elements if they implement Comparable.
  - `isEmpty() / size()` → Check if empty or get count.
  - `toString()` → Custom string representation.

