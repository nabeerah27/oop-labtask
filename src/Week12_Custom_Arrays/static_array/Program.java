package Week12_Custom_Arrays.static_array;

public class Program {

    public void run() {

        MyStaticArray staticArray = new MyStaticArray(5);

        System.out.println();
        System.out.println("=== Inserting elements in array of capacity 5 ===");
        staticArray.insert(10);
        staticArray.insert(20);
        staticArray.insert(30);
        staticArray.insert(40);
        staticArray.insert(50);
        System.out.println("After inserting 5 elements: " + staticArray);

        System.out.println("\n=== Trying to insert when array is full ===");
        staticArray.insert(60); // should show error

        System.out.println("\n=== Insert at index ===");
        staticArray.insert(2, 99); // should show error (full)

        System.out.println("\n=== Getting elements ===");
        System.out.println("Element at index 1: " + staticArray.get(1));
        System.out.print("Element at index 10: ");
        try {
            System.out.println(staticArray.get(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Updating elements ===");
        staticArray.set(1, 71); // update index 1
        System.out.println("Set index 1 to 71: " + staticArray);
        System.out.print("Set index 8 to 53: ");
        staticArray.set(8, 53); // invalid update

        System.out.println("\n=== Deleting elements ===");
        staticArray.delete(); // delete last
        System.out.println("After deleting last: " + staticArray);

        staticArray.delete(2); // delete at index 2
        System.out.println("After deleting element at index 2: " + staticArray);

        System.out.println("\n=== Iterating using for loop ===");
        for (int i = 0; i < staticArray.getSize(); i++)
        {
            System.out.println("Index " + i + ": " + staticArray.get(i));
        }

        System.out.println("\n=== Final Stats ===");
        System.out.println("Size: " + staticArray.getSize());
        System.out.println("Capacity: " + staticArray.getCapacity());

        staticArray.delete();
        staticArray.delete();
        staticArray.delete(); // array becomes empty
        System.out.println("After multiple deletes: " + staticArray);

    }
}
