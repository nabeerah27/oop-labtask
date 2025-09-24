package Week12_Word_Counter_Using_ArrayList.code;

import java.util.Scanner;

public class Program {

    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        WordCounter wordCounter = new WordCounter(sentence);
        wordCounter.split();
        wordCounter.displayCounts();

    }
}
