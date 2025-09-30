package Week13_Mini_LMS.code;

public class Course {

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
    public String toString() {
        return courseCode + " - " + courseName;
    }
}
