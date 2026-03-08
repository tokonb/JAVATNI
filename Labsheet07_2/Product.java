package Labsheet07_2;

public class Product {
    String name;
    double price;
    int quantity;

    public void showInfo() {
        System.out.println("Name   : " + name);
        System.out.println("Price  : " + price + " Baht/Item");
        System.out.println("Stock  : " + quantity + " Items");
        System.out.println("Stock Value: " + (price * quantity) + " Baht");
        System.out.println("----------------------------------------");
    }

    public void sell(int amount) {

        quantity = quantity - amount;
        System.out.println("Sold " + amount + " items");
        System.out.println("----------------------------------------");

    }
}
