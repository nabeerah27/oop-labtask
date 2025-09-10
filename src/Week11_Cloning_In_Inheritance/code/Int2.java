package Week11_Cloning_In_Inheritance.code;

public class Int2 implements Cloneable {

    private int i;

    public Int2(int i) {
        this.i = i;
    }

    public void increment() {
        i ++ ;
    }

    @Override
    public String toString() {
        return "i = " + i;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
