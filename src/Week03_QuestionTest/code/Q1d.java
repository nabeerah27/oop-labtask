package Week03_QuestionTest.code;

public class Q1d {

    int maxElements;    // this is line 2

    public Q1d() {
        maxElements = 100;
        System.out.println(maxElements);
    }

    public Q1d(int i) {
        maxElements = i;
        System.out.println(maxElements);
    }

    public static void main(String[] args) {

        Q1d a = new Q1d(); // this is line 12
        Q1d b = new Q1d(99);
    }
}
