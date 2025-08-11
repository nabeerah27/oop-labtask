package W5_Triangle_Scenario;

public class Program {

    public void run() {

        // Creating a triangle using default constructor
        Triangle t1 = new Triangle();
        System.out.println("------Default Constructor------\n" + t1 + "\n");

        // Creating a triangle using one-parameter constructor
        Triangle t2 = new Triangle(5);
        System.out.println("------One-Parameter Constructor------\n" + t2 + "\n");

        // Creating a triangle using two-parameter constructor
        Triangle t3 = new Triangle(3, 4);
        System.out.println("------Two-Parameter Constructor------\n" + t3 + "\n");

        // Creating a triangle using three-parameter constructor
        Triangle t4 = new Triangle(3, 4, 5);
        System.out.println("------Three-Parameter Constructor------\n" + t4 + "\n");

        // Manually setting sides for t1 and recalculating properties
        t1.set(6, 8, 10);
        System.out.println("------Updated t1 (after using set method)------\n" + t1 + "\n");

        // Displaying total object count
        System.out.println("Total Triangle objects created: " + t4.objectCount());

    }
}
