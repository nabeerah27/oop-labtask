package Week03_QuestionTest.code;

public class Q1h {
    static int j = 40;

    public static void main(String[] args) {

        int i = 10;
        Q1h p = new Q1h();
        p.amethod(i);
        System.out.print(i + " and ");
        System.out.println(j);

    }

    public void amethod(int x) {

        x = x * x;
        j = j * x;

    }
}
