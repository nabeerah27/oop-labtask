package W9_Word_Frequency.code;

public class Program {

    public void run() {

        WordCounter counter = new WordCounter();
        counter.takeInput();
        counter.setWordCounts();
        counter.displayCounts();

    }
}
