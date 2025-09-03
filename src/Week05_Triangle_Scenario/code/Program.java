package Week05_Triangle_Scenario.code;

public class Program {

    public void run() {

        // Creating a triangle using default constructor
        Triangle t1 = new Triangle();
        System.out.println("------Default Constructor------\n" + t1 );

        // Creating a triangle using one-parameter constructor
        Triangle t2 = new Triangle(5);
        System.out.println("------One-Parameter Constructor------\n" + t2 );

        // Creating a triangle using two-parameter constructor
        Triangle t3 = new Triangle(3, 4);
        System.out.println("------Two-Parameter Constructor------\n" + t3 );

        // Creating a triangle using three-parameter constructor
        Triangle t4 = new Triangle(3, 4, 5);
        System.out.println("------Three-Parameter Constructor------\n" + t4 + "\n");

        // Manually setting sides for t1 and recalculating properties
        t1.set(6, 8, 10);
        System.out.println("------Updated t1 (after using set method)------\n" + t1);

        // Clone t4 to a new triangle t5
        System.out.println("------Original triangle------\n" + t4 + "\n"); // still 3, 4, 5
        Triangle t5 = new Triangle(t4);   // clone

        t5.set(7, 8, 9);   // change clone
        System.out.println("------Cloned triangle-------\n" + t5 + "\n"); // now 7, 8, 9

        // Displaying total object count
        System.out.println("Total Triangle objects created: " + t4.objectCount());

    }
}
