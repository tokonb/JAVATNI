import javax.swing.JOptionPane;
public class Lab307 {
    public static void main(String[] args) {
        double total = 0;
        String message = "Input price [press 0 to stop]:";
        while (true) {
            String input = JOptionPane.showInputDialog(message);
            double price = Double.parseDouble(input);
            if (price == 0) {
                break;
            } else if (price < 0) {
                message = "Invalid price!!\nInput price [press 0 to stop]:";
            } else {
                total = total + price;
                message = "Input price [press 0 to stop]:";
            }
        }
        JOptionPane.showMessageDialog(null, "Total price is " + total + " baht.");
    }
}   
