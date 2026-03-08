

public class Brownie extends Bakery {

    private int piece;
    private boolean extraChocolate;

    public Brownie(int piece, boolean extraChocolate, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;
        this.extraChocolate = extraChocolate;
    }

    public void setExtraChocolate(boolean extra) {
        this.extraChocolate = extra;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getUnitPrice() * piece;
        if (extraChocolate) {
            total += (15.0 * piece);
        }
        return total + super.getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Brownie (" + getFlavor() + "), Extra Choc: " + extraChocolate + ", " + piece + " pieces\n" +
                "Total price of Brownie = " + calculateTotalPrice();
    }
}