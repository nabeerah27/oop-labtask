package Week13_Mini_LMS.code;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // Create a new StudentList
        StudentList studentList = new StudentList();

        // Create some Student objects
        Student s1 = new Student("Alice", "S101", 4.0, 1);
        Student s2 = new Student("Charlie", "S103", 1.7, 2);
        Student s3 = new Student("Bob", "S102", 2.5, 2);
        Student s4 = new Student("Alice", "S104", 3.4, 1); // duplicate name
        Student s5 = new Student("Lily", "S106", 2.5, 1);  // duplicate CGPA
        Student s6 = new Student("Eve", "S101", 2.0, 2);   // duplicate seat number

        System.out.println("===== Adding Students =====");
        System.out.println(studentList.addStudent(s1) ? "Added: " + s1.getName() : "Failed to add " + s1.getName());
        System.out.println(studentList.addStudent(s2) ? "Added: " + s2.getName() : "Failed to add " + s2.getName());
        System.out.println(studentList.addStudent(s3) ? "Added: " + s3.getName() : "Failed to add " + s3.getName());
        System.out.println(studentList.addStudent(s4) ? "Added: " + s4.getName() : "Failed to add " + s4.getName());
        System.out.println(studentList.addStudent(s5) ? "Added: " + s5.getName() : "Failed to add " + s5.getName());
        System.out.println(studentList.addStudent(s6) ? "Added: " + s6.getName() : "Failed to add " + s6.getName()); // should fail

        System.out.println("\n===== Sorting Students by Seat Number =====");
        studentList.sortBySeatNo();
        System.out.println(studentList);

        System.out.println("\n===== Current Student List =====");
        System.out.println(studentList);

        System.out.println("===== Add Student at Index 1 =====");
        Student s7 = new Student("David", "S105", 2.2, 2);
        if(studentList.addStudent(1, s7))
        {
            System.out.println("Added " + s7.getName() + " at index 1");
        }
        else
        {
            System.out.println("Failed to add " + s7.getName() + " at index 1");
        }

        System.out.println("\nStudent List after adding at index 1:");
        System.out.println(studentList);

        System.out.println("===== Removing Student by SeatNo 'S102' =====");
        Student removedBySeat = studentList.removeStudent("S102");
        System.out.println(removedBySeat != null ? "Removed: " + removedBySeat.getName() : "Seat number not found");

        System.out.println("\n===== Removing Student by Object =====");
        Student removedObj = studentList.removeStudent(s3);
        System.out.println(removedObj != null ? "Removed: " + removedObj.getName() : "Student object not found");

        System.out.println("\n===== Student List after Removals =====");
        System.out.println(studentList);

        System.out.println("===== Searching Students =====");
        Student searchSeat = studentList.searchBySeatNo("S105");
        System.out.println(searchSeat != null ? "Found by SeatNo: " + searchSeat.getName() : "SeatNo not found");

        System.out.println("\n===== Sorting Students by Name =====");
        studentList.sortByName();
        System.out.println(studentList);

        System.out.println("\n===== Sorting Students by CGPA =====");
        studentList.sortByCGPA();
        System.out.println(studentList);

    }
}
