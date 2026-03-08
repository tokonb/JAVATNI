package Labsheet07_1;

import javax.swing.*;

public class Dialogbo {

    static void main() {
        JOptionPane.showMessageDialog(null, "Welcome to Product Stock System");

        String name = JOptionPane.showInputDialog("Enter product name:");

        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));

        int stock = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock"));

        int input = 0;

        double price1 = 0;

        int choice = JOptionPane.showConfirmDialog(null,
                "Do you want to add more items?",
                "Select an Option",
                JOptionPane.YES_NO_CANCEL_OPTION);

        if (choice == JOptionPane.YES_OPTION) {

            String inputString = JOptionPane.showInputDialog(null, "How many items to add to stock?", "Input", JOptionPane.QUESTION_MESSAGE);
            if (inputString != null) {
                input = Integer.parseInt(inputString);

            }


            int priceConfirm = JOptionPane.showConfirmDialog(null, "Do you want to change price?", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

            if (priceConfirm == JOptionPane.YES_OPTION) {

                price1 = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));


            }

            int newstock = input + stock;

            double newprice = price1*newstock;

            double stockvalue = price * stock;

            System.out.println("Name    : " + name);
            System.out.println("price   : " + price + " Baht/Item");
            System.out.println("Stock   : " + stock + " Items");
            System.out.println("Stock Value: " + stockvalue + " Baht");

            System.out.println(" ");

            System.out.println("Add " + input + " items to stock");
            System.out.println("Change price to " + price1 + " Baht");

            System.out.println(" ");

            System.out.println("Name    : " + name);
            System.out.println("price   : " + price1 + " Baht/Item");
            System.out.println("Stock   : " + newstock + " Items");
            System.out.println("Stock Value: " + newprice + " Baht");






        }
    }
}






