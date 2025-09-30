package Week13_Mini_LMS.code;

import java.util.Comparator;

public class StudentComparators {

    // Sort by name
    public static Comparator<Student> byName = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareToIgnoreCase(s2.getName());
        }
    };

    // Sort by CGPA (descending)
    public static Comparator<Student> byCgpa = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s2.getCGPA(), s1.getCGPA());
        }
    };

}
