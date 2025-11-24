import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int minute = Integer.parseInt(JOptionPane.showInputDialog("input minutes"));

        int hour = 60;
        int Total_hour = minute / hour;
        int minute_1 = minute % 60;

        JOptionPane.showMessageDialog(null, minute + " minutes is " + Total_hour + " hour " + minute_1 + " minute");



    }
}
