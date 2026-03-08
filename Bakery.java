

public class Bakery {

    private String flavor;
    private double unitPrice;
    private int packingCost = 5;

    public Bakery(String flavor, double unitPrice) {
        this.flavor = flavor;
        this.unitPrice = unitPrice;
    }

    public Bakery() {
    }

    public String getFlavor() {
        return flavor;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getPackingCost() {
        return packingCost;
    }

    public double calculateTotalPrice() {
        return unitPrice + packingCost;
    }

    public String toString() {
        return "Thank you for your order!";
    }
}
