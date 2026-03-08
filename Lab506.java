import javax.swing.JOptionPane;

public class Lab506 {

    public static boolean is_prime_number(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 0;

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Enter an integer:");
            if (input == null) return;

            number = Integer.parseInt(input);
            if (number > 1) {
                break;
            }
        }

        if (is_prime_number(number)) {
            JOptionPane.showMessageDialog(null, number + " is Prime number", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, number + " is NOT Prime number", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
