package Week13_Word_Counter_Using_HashMap.code;

import java.util.Map;
import java.util.HashMap;

public class WordCounter {

    private Map<String, Integer> wordCounts; // stores word -> frequency
    private String sentence;

    // Constructor
    public WordCounter(String sentence) {
        wordCounts = new HashMap<>();
        this.sentence = sentence;
    }

    // Accepts raw input string, splits it, and counts
    public void setWordCounts() {
        String[] words = sentence.split("\\s+"); // split words into array

        for (String word : words)
        {
            word = word.toLowerCase();  // optional: to avoid case sensitivity
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
    }

    // Method to display word counts
    public void displayCounts() {
        System.out.println("WORD COUNTS");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
