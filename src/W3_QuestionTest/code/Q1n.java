package W3_QuestionTest.code;

public class Q1n extends BaseN {

    static boolean b1 = false;
    static  int i = -1;
    static double d = 10.1;

    public static void main(String[] args) {

        Q1n m  =new Q1n();
        BaseN b = new BaseN();

        b = m;  // Here
    }
}

class BaseN { }
