package Week12_Custom_Arrays.dynamic_array;

public class Program {

    public void run() {

        MyDynamicArray dynamicArray = new MyDynamicArray(3); // small capacity to test
        System.out.println("Initial size: " + dynamicArray.getSize());
        System.out.println("Initial capacity: " + dynamicArray.getCapacity());

        System.out.println("\n=== INSERTION TESTS ===");
        dynamicArray.insert("Apple");
        dynamicArray.insert("Orange");
        dynamicArray.insert("Banana");
        dynamicArray.insert("Mango"); // should trigger expansion
        System.out.println(dynamicArray);

        dynamicArray.insert("Grapes", 2); // insert at index 2
        System.out.println("After inserting at index 2: " + dynamicArray);

        System.out.print("After inserting at index 10: ");
        dynamicArray.insert("Pineapple", 10); // invalid index test

        System.out.println("\n=== SIZE & CAPACITY AFTER INSERTING FIVE ELEMENTS ===");
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());

        System.out.println("\n=== REMOVAL TESTS ===");
        dynamicArray.remove(); // remove last
        System.out.println("After removing last element: " + dynamicArray);

        dynamicArray.remove(1); // remove at index 1
        System.out.println("After removing index 1: " + dynamicArray);

        System.out.print("After removing index 10: ");
        dynamicArray.remove(10); // invalid index test

        System.out.println("\n=== SIZE & CAPACITY AFTER REMOVING TWO ELEMENTS ===");
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());

        System.out.println("\n=== GET & REPLACE TESTS ===");
        System.out.println("Element at index 2: " + dynamicArray.get(2));

        System.out.print("Element at index 8: ");
        System.out.println(dynamicArray.get(8)); // invalid (returns null)

        dynamicArray.replace(0, "Strawberry");
        System.out.println("After replacing index 0: " + dynamicArray);

        System.out.print("Replacing index 4: ");
        dynamicArray.replace(4, "Kiwi"); // invalid index

        System.out.println("\n=== SEARCH TESTS ===");
        System.out.println("Index of 'Banana': " + dynamicArray.search("Banana"));
        System.out.println("Index of 'Papaya': " + dynamicArray.search("Papaya")); // not found
        dynamicArray.insert(null);
        System.out.println("Index of null: " + dynamicArray.search(null));

        System.out.println("\n=== SORT TESTS ===");
        dynamicArray.insert("Blueberry");
        dynamicArray.insert("Apple");
        dynamicArray.insert("Pineapple");

        System.out.println("Before sort: " + dynamicArray);
        dynamicArray.sort();
        System.out.println("After sort: " + dynamicArray);

        System.out.println("\n=== NOW SIZE & CAPACITY ===");
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Capacity: " + dynamicArray.getCapacity());

        System.out.println("\n=== EMPTY TEST ===");
        MyDynamicArray emptyArr = new MyDynamicArray();
        emptyArr.remove(); // removing from empty
        System.out.println("Search in empty: " + emptyArr.search("Test"));

    }
}
