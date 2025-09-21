package Week12_Change_Calculator.code;

public class Program {

    public void run() {

        System.out.println();
        ChangeCalculator makeChange = new ChangeCalculator();
        makeChange.takeInput();

        if(makeChange.validatePayment())
        {
            makeChange.calculateChangeBreakdown();
            System.out.println(makeChange);
        }

    }
}
