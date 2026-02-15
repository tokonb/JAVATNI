package CoffeeShop;
import javax.swing.JOptionPane;

public class CoffeeShopMain {

    public static void main(String[] args) {

        String[] options = {"Espresso", "Frappuccino"};
        int choice = JOptionPane.showOptionDialog(null, "Select your drink:",
                "Coffee Shop", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (choice == JOptionPane.CLOSED_OPTION) {
            return;
        }

        String size = JOptionPane.showInputDialog("Enter size (S, M, L):");
        if (size == null || size.trim().isEmpty()) {
            return;
        }

        if (choice == 0) {

            Espresso myOrder = new Espresso(size);

            int wantShot = JOptionPane.showConfirmDialog(null,
                    "Do you want to add shots?", "Extra Shot",
                    JOptionPane.YES_NO_OPTION);

            if (wantShot == JOptionPane.YES_OPTION) {
                String shotInput = JOptionPane.showInputDialog("Enter number of shots:");

                try {
                    if (shotInput != null && !shotInput.isEmpty()) {
                        int shots = Integer.parseInt(shotInput);
                        myOrder.addShot(shots);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid number! No shots added.");
                }
            }
            JOptionPane.showMessageDialog(null, myOrder.toString());

        } else if (choice == 1) {

            int wantWhipped = JOptionPane.showConfirmDialog(null,
                    "Add whipped cream (+15 Baht)?", "Whipped Cream",
                    JOptionPane.YES_NO_OPTION);

            boolean hasWhipped = (wantWhipped == JOptionPane.YES_OPTION);
            Frappuccino myOrder = new Frappuccino(size, hasWhipped);

            JOptionPane.showMessageDialog(null, myOrder.toString());
        }
    }
}
