package Assignment02.prob2A.ext;

import Assignment02.prob2A.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Amine");
        student.getReport().setGPA(3.8);

        System.out.println(student);
        System.out.println(student.getReport());

    }
}
