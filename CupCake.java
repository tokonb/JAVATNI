

public class CupCake extends Bakery {

    private int piece;

    public CupCake(int piece, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.piece = piece;
    }

    public boolean isPackingBox() {
        return piece >= 6;
    }

    public int getBoxNumber() {
        return piece / 6;
    }

    public int getBagNumber() {
        return piece % 6;
    }

    @Override
    public int getPackingCost() {
        if (isPackingBox()) {
            return getBoxNumber() * super.getPackingCost();
        }
        return 0;
    }

    @Override
    public double calculateTotalPrice() {
        double bagCost = getBagNumber() * 0.5;
        return (getUnitPrice() * piece) + getPackingCost() + bagCost;
    }

    @Override
    public String toString() {
        String boxStr = isPackingBox() ? getBoxNumber() + " Box " : "";
        return super.toString() + "\n" +
                "Cup cake (" + getFlavor() + ") with " + boxStr + getBagNumber() + " Bag\n" +
                "Total price of Cup Cake = " + calculateTotalPrice();
    }
}
