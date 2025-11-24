import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Enter product id: ");
        String product_id = scan.next();
        System.out.print("Enter product name: ");
        String product_name = scan.next();
        System.out.print("Enter product item: ");
        int product_item = scan1.nextInt();
        System.out.print("Enter price per piece: ");
        double product_price_per = scan1.nextDouble();

        double total_price = product_item * product_price_per;

        System.out.print("-----------------------------------");

        System.out.print("\nProduct name: " + product_name + " (" + product_id + ")");
        System.out.print("\nProduct item: " + product_item + " (" + product_price_per + " baht/piece)");
        System.out.print("\nTotal price : " + total_price + " baht");






    }
}
