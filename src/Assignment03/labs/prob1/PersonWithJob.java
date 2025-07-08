package Assignment03.labs.prob1;

public class PersonWithJob {

    private double salary;
    private Person person;

    public PersonWithJob(String name, double salary) {
        this.person = new Person(name);
        this.salary = salary;
    }

    public String getName() {
        return person.getName();
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public boolean equals(Object aPersonWithJob) {
        if (aPersonWithJob == null) return false;

        if (!(aPersonWithJob instanceof PersonWithJob)) return false;

        PersonWithJob p = (PersonWithJob) aPersonWithJob;

        return this.getName().equals(p.getName()) && this.getSalary() == p.getSalary();
    }

    public static void main(String[] args) {
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        PersonWithJob p2 = new PersonWithJob("Joe",30000);

        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }

    // p1.equals(p2) used PersonWithJob.equals() which compares both name and salary, p2 had no salalry which is false
    // p2.equals(p1) used Person.equals() which compare only names, that why joe and joe are eauql and it returned true

}
