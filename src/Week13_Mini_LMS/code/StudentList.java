package Week13_Mini_LMS.code;

public class StudentList {

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
    public Student removeStudent(String seatNo) {

        if(!seatNoExist(seatNo))
        {
            System.out.println("ERROR: Seat number does not exist in the list.");
            return null;
        }

        // Find the index of the removed student
        int idx = -1;
        for(int i = 0; i < size; i++)
        {
            if(students[i].getSeatNo().equals(seatNo))
            {
                idx = i;
                break;
            }
        }

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

    // Sort students by name (bubble sort)
    public void sortByName() {
        for(int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (students[i].getName().compareToIgnoreCase(students[j].getName()) > 0)
                {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }

            }
        }
    }

    public Student searchBySeatNo(String seatNo) {
        for(int i = 0; i < size; i++)
        {
            if(students[i].getSeatNo().equals(seatNo))
            {
                return students[i];
            }
        }
        return null;
    }

    // String representation of the whole student list
    public String toString() {
        StringBuilder sb = new StringBuilder("Student List:\n");

        for(int i = 0; i < size; i++)
        {
            sb.append(students[i])
                    .append("\n");
        }
        return sb.toString();
    }

    // Helper method to check if seat number already exists in list or not
    private boolean seatNoExist(String seatNo) {
        return searchBySeatNo(seatNo) != null;
    }

}
