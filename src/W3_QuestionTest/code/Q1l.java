package W3_QuestionTest.code;

public class Q1l {

    public static void main(String[] args) {

        Q1l o = new Q1l();
        int iBase = 0;
        o.amethod(iBase);
    }
    public void amethod(int iOver) {
        System.out.println("Over.amethod");
    }
}

class BaseL {
    private void amethod(int iBase) {
        System.out.println("BaseL.amethod");
    }
}
