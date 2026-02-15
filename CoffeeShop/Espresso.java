package CoffeeShop;

public class Espresso extends Drink {
    private int shot;

    public Espresso(String size) {
        super("Espresso", 35, size); // ราคาเริ่มต้น 35
        this.shot = 0;
    }
    public void addShot(int shot) {
        this.shot += shot;
    }
    public int getShot() {
        return this.shot;
    }
    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (this.shot * 15) + getSizeExtra();
    }
    @Override
    public String toString() {
        String message = super.toString();
        if (this.shot > 0) {
            message += "\nAdded " + this.shot + " shot";
        }
        message += "\nTotal price = " + calculateFinalPrice() + " Baht";
        return message;
    }
}
