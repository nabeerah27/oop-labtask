package Week12_Custom_Arrays.dynamic_array;

public class MyDynamicArray {

    private Object[] array;  // Array to hold objects
    private int capacity;    // Current maximum capacity of the array list
    private int size = 0;    // Current number of objects in the array list

    // Default constructor
    public MyDynamicArray() {
        this(100);
    }

    // Constructor with custom capacity
    public MyDynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // Returns size of the dynamic array
    public int getSize() {
        return size;
    }

    // Returns capacity of the dynamic array
    public int getCapacity() {
        return capacity;
    }

    // Check if array is full or not
    public boolean isFull() {
        return size == capacity;
    }

    // Check if array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Expand capacity, if it becomes full
    private void expandCapacity() {
        capacity *= 2;

        Object[] newArray = new Object[capacity];
        for(int i = 0; i < size; i++)
        {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Add object at the last of array (by default)
    public void insert(Object object) {
        if(isFull())
        {
            expandCapacity();
        }
        // Add element at the 'size' index and then increase the size
        array[size ++] = object;
    }

    // Add object at the specific index
    public void insert(Object object, int index) {
        if(index < 0 || index > size) // Index validation
        {
            System.out.println("Error: Index Out of Bound Exception.");
            return;
        }
        if(isFull()) // Expand if full
        {
            expandCapacity();
        }

        // Shift elements to the right to make space for object
        for(int i = size; i > index; i--)
        {
            array[i] = array[i-1];
        }

        // Insert object
        array[index] = object;
        size ++;
    }

    // Remove object at the last (by default)
    public void remove() {
        if(isEmpty())
        {
            System.out.println("ERROR: Array is empty!");
            return;
        }
        // Reduce size first, then remove that element
        array[-- size] = null;
    }

    // Remove object at the specific index
    public void remove(int index) {
        if(isEmpty())
        {
            System.out.println("ERROR: Array is empty!");
            return;
        }
        if(!isValidIndex(index)) // Index validation
        {
            System.out.println("ERROR: Index Out of Bound Exception.");
            return;
        }
        for(int i = index; i < size - 1; i++)
        {
            array[i] = array[i + 1];
        }
        // Reduce size first, then remove that element
        array[-- size] = null;
    }

    // Get element from a specific index
    public Object get(int index) {
        if(!isValidIndex(index)) // Index validation
        {
            System.out.println("ERROR: Index Out of Bound Exception! ");
            return null;
        }
        return array[index]; // Return the element stored at the given index
    }

    // Replace an element at a specific index
    public void replace(int index, Object object) {
        if(!isValidIndex(index)) // Index validation
        {
            System.out.println("ERROR: Index Out of Bound Exception.");
            return;
        }
        array[index] = object; // Replace the existing element with the new object
    }

    // Sort elements of array list, using bubble sort (ascending order)
    public void sort() {
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                Object obj1 = array[i];
                Object obj2 = array[j];

                // Handle null values: push them to the end
                if (obj1 == null || obj2 == null)
                {
                    if (obj1 == null && obj2 != null)
                    {
                        // swap so null goes later
                        array[i] = obj2;
                        array[j] = null;
                    }
                    continue; // skip comparison when null is involved
                }

                if (!(obj1 instanceof Comparable) || !(obj2 instanceof Comparable))
                {
                    System.out.println("ERROR: Non-comparable object found. Cannot sort.");
                    return;
                }

                // Cast elements to Comparable so we can call compareTo()
                Comparable c1 = (Comparable) obj1;
                Comparable c2 = (Comparable) obj2;

                // If c1 > c2 (meaning wrong order), swap them
                if (c1.compareTo(c2) > 0)
                {
                    Object temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Search for an element in the dynamic array
    public int search(Object object) {
        if(isEmpty())
        {
            System.out.println("ERROR: Array is empty! ");
            return -1;
        }
        for(int i = 0; i < size; i++)
        {
            if (object == null) // Searching for null
            {
                // Match found if array[i] is also null
                if (array[i] == null)
                    return i;
            }
            else // Searching for non-null object
            {
                // .equals() checks content equality (not reference like ==)
                if (object.equals(array[i]))
                    return i; // Return index if object is found
            }
        }
        return -1; // if object not found
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Array List: ");
        sb.append("[");  // Start with opening bracket

        // Loop through all elements in the array up to 'size'
        for(int i = 0; i < size; i++)
        {
            sb.append(array[i]);  // Append the element at index i
            if(i < size - 1)
            {
                // Add a comma and space after each element except the last one
                sb.append(", ");
            }
        }
        sb.append("]");  // Closing bracket for the array list
        return sb.toString();  // Return the final string
    }

    // Check the validity of index
    // Index is not negative and within the size, not capacity
    private boolean isValidIndex(int index) {
        return index >= 0 && index < size;
    }

}
