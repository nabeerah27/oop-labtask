package Week12_Word_Counter.code;

import java.util.Scanner;

public class WordCounter {

    private Scanner sc = new Scanner(System.in);
    private String sentence;
    private String[] words; // stores words of the sentence
    private int size;       // number of words in sentence

    // Read sentence from the user
    public void takeInput() {
        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();
    }

    // Split sentence into words and store in array
    public void splitSentenceIntoWords() {
        words = sentence.toLowerCase().split("\\s+"); // split by spaces
        size = words.length;
    }

    // Count and print frequency of each word
    public void displayWordFrequencies() {
        System.out.println("\uD83D\uDD22 Word counts");

        // Array to track counted words
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++)
        {
            if (visited[i])
            {
                continue; // skip if already counted
            }

            int count = 0; // for occurrences of current word
            for (int j = 0; j < size; j++)
            {
                if (words[i].equals(words[j]))
                {
                    visited[j] = true; // mark as counted
                    count++;
                }
            }

            // Print frequency of the current word
            System.out.println(words[i] + ": " + count);
        }
    }

}
