package Week03_QuestionTest.code;

public class Q1o extends BaseO {

    public static void main(String[] args) {
        Q1o m = new Q1o(10);
    }

    Q1o(int i) {
        super(i);
    }

    Q1o(String s, int i) {
        this(i);
        BaseO b = new BaseO(10);    // Here
    }
}

class BaseO {
    public BaseO(int i) { }
}
