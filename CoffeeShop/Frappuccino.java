package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;
    public Frappuccino(String size, boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }
    @Override
    public double calculateFinalPrice() {
        double price = getBasePrice() + getSizeExtra();
        if (this.whipped) {
            price += 15;
        }
        return price;
    }
    @Override
    public String toString() {
        String message = super.toString();
        if (this.whipped) {
            message += "\nAdd whipped 15 Baht";
        }
        message += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return message;
    }
}
