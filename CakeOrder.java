

public class CakeOrder {

    public static void main(String[] args) {

        BirthdayCake order1 = new BirthdayCake("HBD. My Friend", 1.5, "Chocolate", 350.0);
        System.out.println("Birthday Cake's Details:");
        System.out.println("Enter a message on cake: " + order1.getMessage());
        System.out.println("Enter a flavor : " + order1.getFlavor());
        System.out.println("How many pound : 1.5");
        System.out.println(order1.toString());
        System.out.println();

        CupCake order2 = new CupCake(7, "Vanilla", 65.0);
        System.out.println("Cup Cake's Details:");
        System.out.println("Enter a flavor : " + order2.getFlavor());
        System.out.println("How many piece : 7");
        System.out.println(order2.toString());
        System.out.println();

        Brownie order3 = new Brownie(5, true, "Dark Choc", 50.0);
        System.out.println("Brownie's Details:");
        System.out.println("Enter a flavor : " + order3.getFlavor());
        System.out.println("How many piece : 5");
        System.out.println(order3.toString());
        System.out.println();

        double grandTotal = order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice();
        System.out.println("Total price = " + grandTotal);
    }
}