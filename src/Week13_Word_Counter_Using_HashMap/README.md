<h1 align="center">📄 Week 13 - Lab Task</h1>

<h2 align="center">🟢 WORD COUNTER USING HASHMAP </h2>

## 📌 Problem Statement

Write a Java program that inputs a list of words, separated by white
space, and outputs how many times each word appears in the list. You
need not worry about efficiency at this point.

--- 

## 🧩 UML Diagram

The UML diagram representing the class structure of this task:

[➡ View UML Diagram](uml.png)

---

## 📚 Concepts Used

- **Encapsulation:** `wordCounts` map is private, accessed only through class methods.
- **Abstraction:** Word splitting, counting, and displaying logic are hidden inside `WordCounter`.
- **Collections Framework:** Using `HashMap` to store and update word frequencies.
- **String Handling:** Using `split("\\s+")` to tokenize input by whitespace and `toLowerCase()` for case insensitivity.

--- 

## 📝 Learning Notes

- A `HashMap<K,V>` stores key-value pairs and here, `word → count`.
- `.split("\\s+")` splits a string into words using whitespace as the delimiter.
- `.getOrDefault(key, defaultValue)` method to simplify counting. It returns the current value if the key exists, 
otherwise the default value (like `0`). This avoids extra `if-else` checks.

**Without `getOrDefault` (by using `if-else`)**
```  
    if (map.containsKey(word)) {
        map.put(word, map.get(word) + 1);
    } 
    else {
        map.put(word, 1);
    }
```

- Iterating through a `Map` can be done using:
    - `entrySet()` → loop through key-value pairs directly.
    - `keySet()` → loop through only the keys and fetch values with `.get(key)`.

**To display each word along with its frequency, we loop through the keys in the `Map` and fetch their values using `get(key)`:**

```
    for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
    }
```

- Converting all words to lowercase prevents case-sensitive duplication (e.g., "Apple" vs "apple").
- Follows **OOP principle of modularity**; the logic for word counting is isolated inside its own class.
- Input handling and counting are separated, allowing fresh counts for each run if a new `WordCounter` object is created.

---

## 👨‍💻 Code Location

You can view the complete source code for this task here:

[➡ View Week 13 - Word Counter Using HashMap Code](code)

---

## 🖥️ Program Output

Sample console output demonstrating the program’s functionality:

[➡ View Program Output](output.png)

---
