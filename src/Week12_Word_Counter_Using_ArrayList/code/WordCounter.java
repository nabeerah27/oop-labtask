package Week12_Word_Counter_Using_ArrayList.code;

public class WordCounter {

    private String sentence;
    private String[] words; // stores words of the sentence
    private int size;       // number of words in sentence

    public WordCounter(String sentence) {
        this.sentence = sentence;
    }

    // Split sentence into words and store in array
    public void split() {
        words = sentence.toLowerCase().split("\\s+"); // split by spaces
        size = words.length;
    }

    // Count and print frequency (counts) of each word
    public void displayCounts() {
        System.out.println("WORD COUNTS");

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

            // Print frequency (counts) of the current word
            System.out.println(words[i] + ": " + count);
        }
    }

}
