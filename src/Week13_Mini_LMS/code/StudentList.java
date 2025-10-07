package Week13_Mini_LMS.code;

import java.util.Arrays;

public class StudentList implements Cloneable {

    private Student[] students; // Array to hold Student objects
    private int size = 0;       // Current number of students in the list
    private int capacity;       // Current maximum capacity of the list

    // Default constructor (initializes with default capacity = 100)
    public StudentList() {
        this(100, new Student[100]);
    }

    // Constructor with only capacity (creates new empty array of given size)
    public StudentList(int capacity) {
        this(capacity, new Student[capacity]);
    }

    // Constructor (capacity + custom array of students)
    public StudentList(int capacity, Student[] students) {
        this.capacity = capacity;
        this.students = students;
    }

    // Copy constructor
    public StudentList(StudentList other) {
        this.capacity = other.capacity;
        this.size = other.size;
        this.students = other.students;
    }

    // Returns size of the list
    public int getSize() {
        return size;
    }

    // Returns capacity of the list
    public int getCapacity() {
        return capacity;
    }

    // Expand capacity when list is full (doubling strategy)
    private void expandCapacity() {
        capacity *= 2;

        Student[] newArray = new Student[capacity];

        // Copy old elements to new array
        for(int i = 0; i < size; i++)
        {
            newArray[i] = students[i];
        }
        students = newArray;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Add student object at the end of the list
    public boolean addStudent(Student newStudent) {

        // Prevent duplicate seat numbers
        if(seatNoExist(newStudent.getSeatNo()))
        {
            return false;
        }

        // Expand if full
        if(isFull())
        {
            expandCapacity();
        }

        // Add student
        students[size ++] = newStudent;
        return true;
    }

    // Add student object at the specific index
    public boolean addStudent(int idx, Student newStudent) {
        if(idx < 0 || idx > size) // Index validation
        {
            System.out.println("Error: Index Out of Bound Exception.");
            return false;
        }

        // Prevent duplicate seat numbers
        if(seatNoExist(newStudent.getSeatNo()))
        {
            return false;
        }

        // Expand if full
        if(isFull())
        {
            expandCapacity();
        }

        // Shift elements to make space for the element
        for(int i = size; i > idx; i--)
        {
            students[i] = students[i - 1];
        }

        // Insert student
        students[idx] = newStudent;
        size ++ ;
        return true;
    }

    // Remove student by seat number
    public Student removeStudent(String seatNumber) {

        if(!seatNoExist(seatNumber))
        {
            System.out.println("ERROR: Seat number does not exist in the list.");
            return null;
        }

        // Find the index of the removed student
        int idx = searchBySeatNo(seatNumber);

        // Save the student to return later
        Student removedStudent = students[idx];

        // Shift elements left to fill gap
        for (int i = idx + 1; i < size; i++)
        {
            students[i - 1] = students[i];
        }

        // Clear last reference to prevent memory leak
        students[size - 1] = null;
        size--; // reduce size
        return removedStudent;
    }

    // Removes student by passing the Student object directly
    public Student removeStudent(Student s) {
        if (s == null)
            return null;
        return removeStudent(s.getSeatNo());
    }

    public int searchBySeatNo(String seatNo) {
        for(int i = 0; i < size; i++)
        {
            if(students[i].getSeatNo().equals(seatNo))
            {
                return i;
            }
        }
        return -1;
    }

    public int searchByName(String name) {
        for (int i = 0; i < size; i++)
        {
            if(students[i].getName().equalsIgnoreCase(name))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public StudentList clone() throws CloneNotSupportedException {

        StudentList copy = (StudentList) super.clone();
        copy.students = new Student[this.capacity];

        for(int i = 0; i < this.size; i++)
        {
            copy.students[i] = this.students[i].clone();
        }
        return copy;
    }

    // Sort by natural order (seatNo)
    public void sortBySeatNo() {
        Arrays.sort(students, 0, size);
    }

    // Sort by name
    public void sortByName() {
        Arrays.sort(students, 0, size, StudentComparators.byName);
    }

    // Sort by CGPA
    public void sortByCGPA() {
        Arrays.sort(students, 0, size, StudentComparators.byCgpa);
    }

    // Sort by CGPA (ascending)
    public void sortByCgpaAscending() {
        for (int i = 0; i < size - 1; i++)
        {
            for (int j = 0; j < size - i - 1; j++)
            {
                // Custom comparison logic for ascending order
                if (students[j].getCGPA() > students[j + 1].getCGPA())
                {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // String representation of the whole student list
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < size; i++)
        {
            sb.append("\n").append(students[i])
                    .append("\n");
        }
        return sb.toString();
    }

    // Helper method to check if seat number already exists in list or not
    private boolean seatNoExist(String seatNo) {
        return searchBySeatNo(seatNo) > 0;
    }

}
