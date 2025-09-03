package W10_Cloning.code;

public class Cloning extends Array {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println();
        Array v1 = new Array();
        Array v2 = (Array) v1.clone();

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        System.out.println();
        // Increment v2
        v2.increment();

        System.out.println("--- After increment in v2 ---");
        System.out.println("v2: " + v2);

        // See if it changed v1's elements and data items
        System.out.println("v1: " + v1);

    }

}
