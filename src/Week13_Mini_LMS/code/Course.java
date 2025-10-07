package Week13_Mini_LMS.code;

public class Course implements Cloneable {

    private String courseName;
    private int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    @Override
    public Course clone() throws CloneNotSupportedException {
        return (Course) super.clone();
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}
