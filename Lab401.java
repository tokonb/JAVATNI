import javax.swing.*;
import java.util.Locale;

public class Lab401 {
    static void main() {
        String Fullname = (JOptionPane.showInputDialog("Enter your full name:"));



        while (Fullname == null || Fullname.trim().contains(" ") == false)
        {
            Fullname = (JOptionPane.showInputDialog("Enter your full name"));
            if (Fullname == null) return;
        }

        Fullname = Fullname.trim();

        int spaceIndex = Fullname.indexOf(" ");

        String Firstname = Fullname.substring(0,spaceIndex);

        String Lastname = Fullname.substring(spaceIndex + 1);

        String FirstLetter = Firstname.substring(0,1).toUpperCase();

        String Rest = Firstname.substring(1).toLowerCase();

        String RealFirstname = FirstLetter + Rest;

        String Reallastname = Lastname.toUpperCase();



        JOptionPane.showMessageDialog(null, "Welcome, " + RealFirstname + " " + Reallastname);
    }
}
