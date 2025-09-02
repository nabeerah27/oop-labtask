package W9_Word_Frequency.code;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class WordCounter {

    private Map<String, Integer> wordCounts; // stores word -> frequency
    private Scanner sc = new Scanner(System.in);
    private String input;

    // Constructor
    public WordCounter() {
        wordCounts = new HashMap<>();
    }

    public void takeInput() {
        System.out.print("Enter words separated by spaces: ");
        input = sc.nextLine();
    }

    // Accepts raw input string, splits it, and counts
    public void setWordCounts() {
        String[] words = input.split("\\s+"); // split words into array

        for (String word : words)
        {
            word = word.toLowerCase();  // optional: to avoid case sensitivity
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
    }

    // Method to display word counts
    public void displayCounts() {
        System.out.println("\uD83D\uDD22 Word counts  ");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
