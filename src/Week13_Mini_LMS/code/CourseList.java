package Week13_Mini_LMS.code;

public class CourseList {

    private String[] courseNames;
    private String[] courseCodes;

    // Constructor with validation and shallow copy
    public CourseList(String[] courseNames, String[] courseCodes) {
        if (courseNames.length != courseCodes.length)
        {
            throw new IllegalArgumentException("Course names and codes must have the same length!");
        }
        this.courseNames = courseNames;
        this.courseCodes = courseCodes;
    }

    // Getter for course names
    public String[] getCourseNames() {
        return courseNames;
    }

    // Getter for course codes
    public String[] getCourseCodes() {
        return courseCodes;
    }

    // Converts course list into a formatted string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++)
        {
            sb.append(". ")
                    .append(courseCodes[i]) // Course code
                    .append(" - ")
                    .append(courseNames[i]) // Course name
                    .append("\n");
        }
        return sb.toString();
    }

}
