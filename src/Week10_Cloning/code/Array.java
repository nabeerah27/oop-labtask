package Week10_Cloning.code;

public class Array implements Cloneable {

    private int[] anArray;  // Array declaration as private field
    private int value;      // Declare primitive type (int) as private field

    // Default constructor
    public Array() {

        // Initialize array with values
        anArray = new int[]{1, 2, 3, 4, 5};
        value = 29;  // Initialize value
    }

    // Method to increment each element of the array by 1
    public void increment() {

        for (int i = 0; i < anArray.length; i++)
        {
            anArray[i] ++ ;
        }

        // Increment in value
        value ++ ;
    }

    // Clone method to create deep copy of anArray
    @Override
    public Object clone() throws CloneNotSupportedException {

        // Call Object.clone() for shallow copy
        Array copyArray = (Array) super.clone();

        // Deep copy of the array so both objects don’t share the same array reference
        copyArray.anArray = this.anArray.clone();

        // value (primitive) is automatically copied → no need to handle separately
        return copyArray;   // return cloned object

    }

    // Override toString() method for formatted output
    @Override
    public String toString() {
        // Print value
        System.out.println("Value: " + this.value);

        // Convert array into string format for printing
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < anArray.length; i++)
        {
            sb.append(anArray[i]);

            if (i < anArray.length - 1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
