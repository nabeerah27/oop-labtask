package W3_QuestionTest.code;

public class Q1m {

    public static void main(String[] args) {

        Q1m q1m = new Q1m();
        q1m.amethod();
    }

    public void amethod() {
        int k = 10;

        switch(k) {
            default:    // Put the default at the bottom, not here
                System.out.println("This is the default output");
                break;

            case 10:
                System.out.print("Ten ");

            case 20:
                System.out.println("Twenty");
                break;

        }
    }
}
