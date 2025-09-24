<h1 align="center">📄 Week 12 - Lab Task</h1>

<h2 align="center">🟢 WORD COUNTER BY USING ARRAYLIST </h2>

----

## 📌 Problem Statement

Write a Java program that inputs a list of words, separated by white
space, and outputs how many times each word appears in the list. You
need not worry about efficiency at this point.

--- 

## 📚 Concepts Applied

- **Word Array:** Used to store words after splitting the input sentence.
- **Boolean Array:** Keeps track of which words are already counted, preventing duplicates in output.
- **String Handling:** `split(\\\s+)` is used to separate the sentence into words.
- **Case Insensitivity:** Input converted to lowercase ensures words like Java and java are counted together.

---

## 📝 Learning Notes

- Splitting a sentence with `.split(\\s+)` ensures multiple spaces are handled correctly.
- A `boolean[ ] visited` array (same length as `words` array) is created to mark whether a word’s frequency has already been counted.
- For each word, check if it has already been visited:
    1. If yes → skip it.
    2. If no → start counting its frequency.
- Compare the current word with all other words in the array.
- Each time a match is found, increase the `count` and mark that word as visited.
- Once all comparisons are complete, record or print the word with its final frequency.
- Converting all words to lowercase prevents treating Apple and apple as different words.

---

## ⚙️ How It Works 

- Input: User enters a sentence
- Processing:
    - Convert input to lowercase
    - Split into words using regex "\\\s+"
    - Use boolean[ ] visited to track counted words
    - Count occurrences of each unique word
- Output: Display each word and its frequency

---

## 👨‍💻 Code Location

You can view the complete source code for this task here:

[➡ View Week 12 - Word Counter Using ArrayList Code](code)

---

## 🖥️ Sample Run

**Input →** Enter a sentence: "apple banana apple orange banana apple"
**Words array →** ["apple", "banana", "apple", "orange", "banana", "apple"]

**Output:** 
- apple: 3
- banana: 2
- orange: 1

---

