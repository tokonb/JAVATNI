public class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addStock(int amount) {
        this.quantity += amount;
    }



    // Getters for displaying summary
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }


}
