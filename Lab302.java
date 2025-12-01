import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = (JOptionPane.showInputDialog("Enter your name:"));
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter your height(cm.):"));
        int male = JOptionPane.showConfirmDialog(null, "Are your biological is Male?");

        double female_base = 110;
        double male_base = 100;
        double male_weight = height - male_base;
        double female_weight = height - female_base;

        if(male == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null,"Hello, Mr." + name + "\nIf your height is " + height + " cm." + "\nYour weight should be " + male_weight + " kg." );

        }
        else {
            int female = JOptionPane.showConfirmDialog(null, "Are your biological is female?");
            if(female == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"Hello, Mr." + name + "\nIf your height is " + height + " cm." + "\nYour weight should be " + female_weight + " kg." );
            }
            else {
                JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight and height." );
            }


        }





    }
}
