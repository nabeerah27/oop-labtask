package Week12_Word_Counter.code;

public class Program {

    public void run() {

        WordCounter wordCounter  =new WordCounter();
        wordCounter.takeInput();
        wordCounter.splitSentenceIntoWords();
        wordCounter.displayWordFrequencies();

    }
}
