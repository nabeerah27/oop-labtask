package Week03_QuestionTest.code;

public class Q1f {
    public static void main(String[] args) {

        int i;
        int j;

        for (i = 2; i < 4; i++)     // Outer
        {
            for (j = 0; j < 3; j++)     // Inner
            {
                if(i == 2)
                    continue;
                System.out.println("Value n for i = " + i + "Value for j = " + j);
            }
        }
    }
}
