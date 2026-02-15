package CoffeeShop02;

public abstract class Drink implements Priceable {
    private String drinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName, double basePrice, String size) {
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    @Override
    public double getBasePrice() {
        return this.basePrice;
    }

    @Override
    public double getSizeExtra() {
        if (this.size.equalsIgnoreCase("S")) {
            return 0;
        } else if (this.size.equalsIgnoreCase("M")) {
            return 10;
        } else if (this.size.equalsIgnoreCase("L")) {
            return 15;
        } else {
            return 0;
        }
    }

    public abstract double calculateFinalPrice();

    @Override
    public String toString() {
        return "Your order: " + this.drinkName + " (Size: " + this.size.toUpperCase() + ")";
    }
}
