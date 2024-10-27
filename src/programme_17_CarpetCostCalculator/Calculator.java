package programme_17_CarpetCostCalculator;

public class Calculator {

    // instance variable
    private Floor floor;
    private Carpet carpet;

    // constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }

    // method calculate totalcost
    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}