package Week13_Word_Counter_Using_HashMap.code;

import java.util.Scanner;

public class Program {

    public void run() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        WordCounter counter = new WordCounter(sentence);
        counter.setWordCounts();
        counter.displayCounts();

    }
}
