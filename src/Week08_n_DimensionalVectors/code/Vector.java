package Week08_n_DimensionalVectors.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Vector implements Cloneable, Iterable<Double> {

    // Holds the coordinates of the vector
    private List<Double> coordinates;

    // Empty constructor that creates an empty vector
    public Vector() {
        this.coordinates = new ArrayList<>(); // initialize empty list
    }

    // Constructor with dimension → fills with zeros
    public Vector(int numOfCoordinates) {
        this.coordinates = new ArrayList<>(numOfCoordinates);

        for(int i = 0; i < numOfCoordinates; i++)
        {
            this.coordinates.add(0.0);
        }
    }

    // Constructor from a given list → makes a defensive copy
    public Vector(List<Double> coordinates) {
        this.coordinates = new ArrayList<>(coordinates);
    }

    // Returns the coordinate at the given index
    public double get(int index) {
        if (index < 0 || index >= coordinates.size())
        {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return coordinates.get(index);

    }

    // Updates the coordinate value at the given index
    public void set(int index, double value) {
        if (index < 0 || index >= coordinates.size())
        {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        coordinates.set(index, value);
    }

    // Vector addition (element-wise) → returns a new vector
    public Vector add(Vector other) {

        if (this.length() != other.length())
        {
            throw new IllegalArgumentException("Vectors must have same dimension for addition. ");
        }
        List<Double> result = new ArrayList<>(this.length());

        for (int i = 0; i < this.length(); i++)
        {
            result.add(this.get(i) + other.get(i));
        }
        return new Vector(result);
    }

    // Returns dimension (total number of coordinates)
    public int length() {
        return coordinates.size();
    }

    // Nicely prints vector as [a, b, c]
    public String toString() {
        return coordinates.toString();
    }

    // Deep clone that creates a copy of vector with its own list
    @Override
    public Vector clone() {
        try {
            Vector copy = (Vector) super.clone();
            copy.coordinates = new ArrayList<>(this.coordinates);
            return copy;

        } catch(CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    // Equality check that compares sizes and values of coordinates
    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (!(object instanceof Vector)) return false;

        Vector other = (Vector) object;
        if (this.coordinates.size() != other.coordinates.size()) return false;

        return this.coordinates.equals(other.coordinates);
    }

    // Custom iterator (so we can use for-each loops on Vector)
    @Override
    public Iterator<Double> iterator() {
        return new Iterator<>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < coordinates.size();
            }

            @Override
            public Double next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return coordinates.get(index++);
            }
        };
    }
}
