package W8_Range.code;

public class Program {
    public void run() {

        // Only end given
        Range r1 = new Range(5);
        System.out.println("Range r1: " + r1);

        // Start and end given
        Range r2 = new Range(2, 10);
        System.out.println("Range r2: " + r2);

        // Start, end, and step given
        Range r3 = new Range(2, 10, 2);
        System.out.println("Range r3: " + r3);

        // Negative step
        Range r4 = new Range(3, -5, -1);
        System.out.println("Range r4: " + r4);

        // Length of range
        System.out.println("Length of Range r1: " + r1.length());
        System.out.println("Length of Range r4: " + r4.length());

        // Using for-each loop with iterator
        System.out.print("Iterating through Range r3: ");
        for(int num : r3)
        {
            System.out.print(num + " ");
        }
        System.out.println();

        // Multiplying each element by 2 using for-each loop
        System.out.println("Multiplying each element of Range r4 by 2 using for-each loop: ");
        for(int num : r4)
        {
            System.out.print( (num * 2) + " ");
        }
        System.out.println();

        // Checks if range contains value (any number)
        System.out.println("Is Range r2 contains 7? : " + r2.contains(7));
        System.out.println("Is Range r2 contains 17? : " + r2.contains(17));


        // Get element from any index
        System.out.println("Element at index 4 in Range r1: " + r1.get(4));
        System.out.println("Element at index 10 in Range r4: " + r4.get(10));


    }
}
