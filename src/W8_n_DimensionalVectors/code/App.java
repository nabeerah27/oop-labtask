package W8_n_DimensionalVectors.code;

import java.util.List;

public class App {

    public void run() {

        // 1. Using empty constructor
        Vector v1 = new Vector();
        System.out.println("Empty vector v1: " + v1);

        // 2. Using size constructor
        Vector v2 = new Vector(3); // vector of length 3 -> [0.0, 0.0, 0.0]
        System.out.println("Vector by passing just length as argument v2: " + v2);

        // Set values in v2
        v2.set(0, 5.0);
        v2.set(1, 2.0);
        v2.set(2, -1.0);
        System.out.println("Updated Vector v2 by setting values at each index: " + v2);

        // Get a value
        System.out.println("Value at index 1 of Vector v2 (v2[1]): " + v2.get(1));

        // 3. Using List constructor
        Vector v3 = new Vector(List.of(1.0, 2.0, 3.0));
        System.out.println("Vector by passing list as argument v3: " + v3);

        // 4. Add and subtract vectors
        Vector v4 = v2.add(v3);
        System.out.println("New Vector v4 by adding v2 and v3: " + v4);

        System.out.println("Adding 1.5 in each element of Vector v2 by using for-each loop: ");
        for(Double vec : v2)
        {
            System.out.println((vec + 1.5));
        }

        // Clone of v4
        Vector v5 = v3.clone();
        System.out.println("Cloned Vector v5 from v3: " + v5);

        v5.set(1, 99.9); // change clone → should not affect v3
        System.out.println("Changed clone Vector: " + v5);
        System.out.println("Original v3 after v5 modified: " + v3);

    }
}
