import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Lab206 {

    public static void main(String[] args) {


        final int PRICE_PER_PERSON = 299;
        final double TAX_RATE = 0.07; // 7% VAT


        DecimalFormat df = new DecimalFormat("#,##0.00");


        String inputCustomers = JOptionPane.showInputDialog("How many customer?");
        int numberOfCustomers = Integer.parseInt(inputCustomers);


        double subTotal = numberOfCustomers * PRICE_PER_PERSON;
        double totalWithTax = subTotal + (subTotal * TAX_RATE);


        String inputDiscount = JOptionPane.showInputDialog(
                "Price with NET is " + df.format(totalWithTax) + " baht.\n" +
                        "How much of discount (%) on your coupon?");
        double discountPercent = Double.parseDouble(inputDiscount);


        double discountAmount = totalWithTax * (discountPercent / 100);
        double finalPrice = totalWithTax - discountAmount;


        String inputPaid = JOptionPane.showInputDialog(
                "Total price is " + df.format(finalPrice) + " baht.\n" +
                        "Enter the amount the customer paid:");
        double amountPaid = Double.parseDouble(inputPaid);


        double change = amountPaid - finalPrice;

        
        String message = "Total price is " + df.format(finalPrice) + " baht.\n" +
                "Customer paid " + df.format(amountPaid) + " baht.\n" +
                "Get change " + df.format(change) + " baht.";

        JOptionPane.showMessageDialog(null, message);
    }
}
