public class Donor {
    private String name;
    private double amount;


    public Donor (String name, double amount) {
        this.name = name;
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " has donated $" + amount + ".";
    }
}
