

import javax.swing.JOptionPane;

public class CakeOrder3 {

    public static void main(String[] args) {

        String poundsStr = JOptionPane.showInputDialog(null, "How many pounds do you want?");
        if (poundsStr == null) return;
        double pounds = Double.parseDouble(poundsStr);

        String flavor = JOptionPane.showInputDialog(null, "Enter a flavor birthday cake:");
        if (flavor == null) return;

        String message = JOptionPane.showInputDialog(null, "Enter a message on cake:");
        if (message == null) return;

        BirthdayCake cake = new BirthdayCake(message, pounds, flavor, 400.0);

        while (true) {
            String confirmMessage = cake.toString() + "\n\nConfirm this order?";
            int choice = JOptionPane.showConfirmDialog(null, confirmMessage, "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, cake.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (choice == JOptionPane.NO_OPTION) {
                String newMessage = JOptionPane.showInputDialog(null, "Enter a new message for changing:");
                if (newMessage != null) {
                    cake.changeMessage(newMessage);
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }
}
