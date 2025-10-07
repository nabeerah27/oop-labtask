package Week13_Mini_LMS.code;

import java.util.ArrayList;
import java.util.List;

public class Semester implements Cloneable {

    private int semesterNo;
    private List<Course> courses;

    public Semester(int semesterNo) {
        this.courses = new ArrayList<>();
        this.semesterNo = semesterNo;

        assignCourses(); // automatically assign courses to the Student object according to the semester number
    }

    @Override
    public Semester clone() throws CloneNotSupportedException {
        Semester copy = (Semester) super.clone();
        copy.courses = new ArrayList<>();

        for(Course course : courses)
        {
            copy.courses.add(course.clone());
        }
        return copy;
    }

    public void assignCourses() {
        switch(semesterNo)
        {
            case 1:
                courses.add(new Course("Programming Fundamentals", 351));
                courses.add(new Course("ICT", 353));
                courses.add(new Course("Calculus and Analytical Geometry", 355));
                courses.add(new Course("Applied Physics", 357));
                courses.add(new Course("Functional English", 359));
                courses.add(new Course("Islamiat", 361));
                break;

            case 2:
                courses.add(new Course("Object Oriented Programming", 352));
                courses.add(new Course("Digital Logic Design", 354));
                courses.add(new Course("Linear Algebra", 356));
                courses.add(new Course("Discrete Mathematics", 358));
                courses.add(new Course("Ideology of Pakistan", 360));
                courses.add(new Course("Communication and Presentation Skills", 362));
                break;

            default:
                System.out.println("Invalid semester number! ");

        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "\nSemester: " + semesterNo + "\nCourses: " + courses;
    }

}
