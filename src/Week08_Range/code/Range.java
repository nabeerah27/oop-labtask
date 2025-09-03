package Week08_Range.code;

import java.util.Iterator;

// The Range class mimics Python's range()
// It generates numbers lazily (no list stored in memory) and supports iteration using the Iterable interface.
public class Range implements Iterable<Integer> {

    private int start;      // starting number of range
    private int step;       // step size (increment/decrement)
    private int end;        // ending number (exclusive)
    private int length;     // total number of elements in the range

    // Creates a range with default start (0) up to 'end' with default step (1)
    public Range(int end) {
        this(0, end, 1);
    }

    // Creates a range starting from 'start' up to 'end' with default step (1)
    public Range(int start, int end) {
        this(start, end, 1);
    }

    // Creates a range starting from 'start', up to 'end' progressing by 'step' (can be positive or negative, but not zero)
    public Range(int start, int end, int step) {

        // Validate that step is not zero
        Validator.validateStep(step);

        this.start = start;
        this.end = end;
        this.step = step;

        // Calculate how many numbers will be generated
        this.length = Validator.calculateLength(start, end, step);
    }

    // Return number of elements in the range
    public int length() {
        return this.length;
    }

    // Get element at a given index
    public int get(int index) {
        Validator.validateIndex(index, length);     // Checks for valid index
        return start + index * step;
    }

    // Checks whether the given value lies within the range.
    public boolean contains(int value) {
        return Validator.isValueValid(start, end, step, value);
    }


    // Iterator to allow for-each looping
    @Override
    public Iterator<Integer> iterator() {

        return  new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public Integer next() {
                int value = start + index * step;
                index++;
                return value;

            }
        };
    }

    // String representation of the range (like a list)
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < length; i++)
        {
            sb.append(get(i));
            if (i < length - 1) sb.append(", ");
        }

        sb.append("]");
        return sb.toString();
    }

}
