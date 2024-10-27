package programme_17_CarpetCostCalculator;

public class Carpet {

    // instance variable
    private double cost;

    // constructor
    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;

    }

    // method calculate cost
    public double getCost() {
        return cost;
    }
}