package Week03_QuestionTest.code;

public class Q1i {

    public static void main(String[] args) {

        Q1i l = new Q1i();
        l.amethod();

    }

    public void amethod() {
        int ia[] = new int[4];

        for(int i = 0; i < ia.length; i++)   // Start of for loop
        {
            ia[i] = i;
            System.out.println(ia[i]);
        }
    }
}
