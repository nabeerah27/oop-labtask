package W8_Range.code;

// Utility class for validating parameters of the Range class that only contains static methods
public class Validator {

    // Step cannot be zero, otherwise the range would never progress
    public static void validateStep(int step) {
        if(step == 0)
        {
            throw new IllegalArgumentException("Step cannot be zero");
        }
    }

    // Calculates how many numbers will exist in the range
    public static int calculateLength(int start, int end, int step) {

        // Check if range can progress with given step
        if ((step > 0 && start < end) || (step < 0 && start > end)) {

            // Adjust formula based on step direction
            if (step > 0)
            {
                return Math.max(0, (end - start + step - 1) / step);
            }
            else
            {
                return Math.max(0, (end - start + step + 1) / step);
            }
        }
        // If range cannot progress, return 0
        return 0;
    }

    // Checks if the index is valid for a given length
    // Supports Python-style negative indexing (e.g., -1 means last element)

    public static void validateIndex(int index, int length) {
        if (index < 0)
        {
            index = length + index;     // Convert negative index
        }
        if (index < 0 || index >= length)
        {
            throw new IndexOutOfBoundsException("Index " + index  + " out of range. ");
        }
    }

    public static boolean isValueValid(int start, int end, int step, int value) {
        if (step == 0) return false; // step can't be zero

        if (step > 0)   // Positive step
        {
            return value >= start && value < end && (value - start) % step == 0;
        }
        else    // Negative step
        {
            return value <= start && value > end && (start - value) % -step == 0;
        }
    }


}
