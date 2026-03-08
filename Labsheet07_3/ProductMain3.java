package Labsheet07_3;

public class ProductMain3 {

    public static void setting_product(Product... products) {
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

            for (Product item : products) {
                System.out.println("Name  : " + item.name);
                System.out.println("Price : " + item.price + " Baht/Item");
                System.out.println("Stock : " + item.quantity + " Items");

                double stockValue = item.price * item.quantity;
                System.out.println("Stock Value: " + stockValue + " Baht");

                System.out.println("----------------------------------------");

        }



    }


}
