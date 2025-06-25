package Assignment2.prob2A;

public class GradeReport {
    private Student student;
    private double GPA;


    GradeReport(Student student) {
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "GPA=" + GPA +
                ", studentName=" + student.getName() +
                '}';
    }
}