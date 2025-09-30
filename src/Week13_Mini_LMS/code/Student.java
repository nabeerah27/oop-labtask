package Week13_Mini_LMS.code;

public class Student implements Comparable<Student> {

    private String name;
    private String seatNo;
    private double CGPA;
    private Semester semester;

    public Student(String name, String seatNo, double CGPA, int semesterNo) {
        this.name = name;
        this.seatNo = seatNo;
        this.CGPA = CGPA;
        this.semester = new Semester(semesterNo);
    }

    public String getName() {
        return name;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public int compareTo(Student other) {
        return this.seatNo.compareTo(other.seatNo); // natural order by seatNo
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(seatNo).
                append(" - ").append(name).
                append(" (CGPA: ").append(CGPA).append(") ").
                append(semester);

        return sb.toString();
    }

}
