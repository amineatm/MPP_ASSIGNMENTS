package Assignment3.labs.prob2;

public class Apartment {
    private int id;
    private double rent;

    public Apartment(int id, double rent) {
        this.id = id;
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    public int getId() {
        return id;
    }
}
