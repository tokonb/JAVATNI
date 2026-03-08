package Labsheet07_3;

import java.util.Scanner;

public class ProductMain4 {

    public static void setting_product(Product[] products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        setting_product(products);

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MINI SHOP!!");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < products.length; i++) {
            System.out.println("Press " + (i + 1) + " to buy " + products[i].name + " (items=" + products[i].quantity + ")");
        }

        System.out.println("----------------------------------------------------");

        System.out.print("Enter a number: ");
        int choice = input.nextInt();

        while (choice < 1 || choice > 4) {
            System.out.print("Invalid!! Enter a number: ");
            choice = input.nextInt();
        }

        System.out.println("----------------------------------------------------");

        Product selectedProduct = products[choice - 1];

        System.out.print("How many " + selectedProduct.name + " do you want to buy? ");
        int buyQty = input.nextInt();

        if (buyQty > selectedProduct.quantity) {
            System.out.println("Not enough items in stock...\n");
        } else {
            selectedProduct.quantity -= buyQty;
            System.out.println();
        }

        System.out.println("Name  : " + selectedProduct.name);
        System.out.println("Price : " + selectedProduct.price + " Baht/Item");
        System.out.println("Stock : " + selectedProduct.quantity + " Items");

        double stockValue = selectedProduct.price * selectedProduct.quantity;
        System.out.println("Stock Value: " + stockValue + " Baht");

        input.close();
    }
}
