package Week12_Custom_Arrays.static_array;

public class MyStaticArray {

    private int[] array;  // the actual arrays storage
    private int size = 0; // no. of elements that are currently stored
    private final int capacity; // no. of fixed maximum size of the array

    public MyStaticArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    // Check if array is full or not
    public boolean isFull() {
        return size == capacity;
    }

    // Check if array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Insert element at the last (by default)
    public void insert(int element) {
        if(isFull())
            System.out.println("❌ ERROR: Array is full! Can't insert element at the last.");
        else
            array[size++] = element; // add element at the 'size' index and then increment in size
    }

    // Insert element at the given index by shifting elements to the right
    public void insert(int index, int element) {
        if (isFull())
        {
            System.out.println("❌ ERROR: Array is full! Can't insert element at the given index.");
            return;
        }
        if (index >= 0 && index <= size)
        {
            // Shift elements one step to the right
            for (int i = size; i > index; i--)
            {
                array[i] = array[i - 1];
            }
            array[index] = element;
            size++; // increase size
        }
        else
            System.out.println("❌ ERROR: Invalid index.");
    }

    // Returns element from the given index
    public int get(int index) {
        if(isValidIndex(index))
        {
            return array[index];
        }
        else
        {
            throw new IndexOutOfBoundsException("❌ ERROR: Invalid index");
        }
    }

    // Set element at the given index (update)
    public void set(int index, int element) {
        if(isValidIndex(index))
        {
            array[index] = element;
        }
        else
        {
            System.out.println("❌ ERROR: Invalid index.");
        }
    }

    // Removes element at the last (by default)
    public void delete() {
        if(isEmpty())
            System.out.println("❌ ERROR: Array is empty! Nothing to delete.");
        else
        {
            array[size - 1] = 0;  // reset the number to zero
            size -- ;  // reduce size
        }
    }

    // Removes element at the given index by shifting elements to the left
    public void delete(int index) {
        if(isEmpty())
        {
            System.out.println("❌ ERROR: Arrays is empty! Nothing to delete.");
        }
        if(isValidIndex(index))
        {
            // Shift elements one step to the left
            for(int i = index + 1; i < size; i++)
            {
                array[i-1] = array[i];
            }
            size--; // reduce size
        }
        else
            System.out.println("❌ ERROR: Invalid index");
    }

    // Returns the size of the array
    public int getSize() {
        return size;
    }

    // Returns the capacity of the array
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < size; i++)
        {
            sb.append(array[i]);
            if(i < size-1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Check the validity of index
    private boolean isValidIndex(int index) {
        return index >= 0 && index < size;
    }

}
