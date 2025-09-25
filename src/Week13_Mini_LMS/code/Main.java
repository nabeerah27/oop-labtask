package Week13_Mini_LMS.code;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create a new StudentList
        StudentList studentList = new StudentList();

        // Create some Student objects
        Student s1 = new Student("Alice", "S101");
        Student s2 = new Student("Bob", "S102");
        Student s3 = new Student("Charlie", "S103");
        Student s4 = new Student("Alice", "S104"); // duplicate name
        Student s5 = new Student("Eve", "S101");   // duplicate seat number

        System.out.println("=== Adding Students ===");
        System.out.println(studentList.addStudent(s1) ? "Added: " + s1.getName() : "Failed to add " + s1.getName());
        System.out.println(studentList.addStudent(s2) ? "Added: " + s2.getName() : "Failed to add " + s2.getName());
        System.out.println(studentList.addStudent(s3) ? "Added: " + s3.getName() : "Failed to add " + s3.getName());
        System.out.println(studentList.addStudent(s4) ? "Added: " + s4.getName() : "Failed to add " + s4.getName());
        System.out.println(studentList.addStudent(s5) ? "Added: " + s5.getName() : "Failed to add " + s5.getName()); // should fail

        System.out.println("\nCurrent Student List:");
        System.out.println(studentList);

        System.out.println("=== Add Student at Index 1 ===");
        Student s6 = new Student("David", "S105");
        if(studentList.addStudent(1, s6)) {
            System.out.println("Added " + s6.getName() + " at index 1");
        } else {
            System.out.println("Failed to add " + s6.getName() + " at index 1");
        }

        System.out.println("\nStudent List after adding at index 1:");
        System.out.println(studentList);

        System.out.println("=== Removing Student by SeatNo 'S102' ===");
        Student removedBySeat = studentList.removeStudent("S102");
        System.out.println(removedBySeat != null ? "Removed: " + removedBySeat.getName() : "Seat number not found");

        System.out.println("=== Removing Student by Object ===");
        Student removedObj = studentList.removeStudent(s3);
        System.out.println(removedObj != null ? "Removed: " + removedObj.getName() : "Student object not found");

        System.out.println("\nStudent List after Removals:");
        System.out.println(studentList);

        System.out.println("=== Searching Students ===");
        Student searchSeat = studentList.searchBySeatNo("S105");
        System.out.println(searchSeat != null ? "Found by SeatNo: " + searchSeat.getName() : "SeatNo not found");

        System.out.println("=== Sorting Students by Name ===");
        studentList.sortByName();
        System.out.println(studentList);

    }
}
