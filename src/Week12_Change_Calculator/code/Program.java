package Week12_Change_Calculator.code;

public class Program {

    public void run() {

        System.out.println();
        ChangeCalculator makeChange = new ChangeCalculator();
        makeChange.takeInput();
        makeChange.processPayment();
        System.out.println(makeChange);

    }
}
