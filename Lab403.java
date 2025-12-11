import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {


        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        while (true)
        {

            String InputUsername = (JOptionPane.showInputDialog("Enter username:"));

            if (InputUsername == null) return;

            String InputPassword = (JOptionPane.showInputDialog("Enter password:"));

            if (InputPassword == null) return;

            if (InputUsername.equalsIgnoreCase(USERNAME) && InputPassword.equals(PASSWORD))
            {
                JOptionPane.showMessageDialog(null, "Login Success!!");
                break;
            }
            else
            {

                JOptionPane.showMessageDialog(null, "Login Fail...", "Incorrect username or password", JOptionPane.WARNING_MESSAGE);

            }
        }
    }
}