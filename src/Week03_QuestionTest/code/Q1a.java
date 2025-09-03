package Week03_QuestionTest.code;

public class Q1a {

    public void run(int count) {

        System.out.println("I am sab because count is " + count);
        count -- ;

        if(count > 0)
            run(count);     // this is line number 6

        System.out.println("I am happy because count is " + count);
    }

    public static void main(String[] args) {

        Q1a q1a = new Q1a();
        q1a.run(2);

    }
}
