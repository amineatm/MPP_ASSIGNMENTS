package Assignment2.prob2A;

public class Student {
    private String name;
    private GradeReport report;

    public Student(String name) {
        this.name = name;
        this.report = new GradeReport(this);
    }

    public GradeReport getReport() {
        return report;
    }

    public String getName() {
        return name;
    }

    public void setReport(GradeReport report) {
        this.report = report;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + report.getGPA() +
                '}';
    }
}
