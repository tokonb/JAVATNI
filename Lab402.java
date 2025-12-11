import javax.swing.*;

public class Lab402 {
    static void main() {

        String id = (JOptionPane.showInputDialog("Enter student-id:"));

        while (id == null || id.length() != 10) {
            id = JOptionPane.showInputDialog("Cannot found major");

            if (id == null) return;



        }
        String code = id.substring(2, 5);
        String major = "";

        if (code.equals("131")) {
            major = "Information Technology (IT)";
        }
        else if (code.equals("132")) {
            major = "Multimedia Technology (MT)";
        }
        else if (code.equals("133")) {
            major = "Digital Business Information Technology (BI)";
        }
        else if (code.equals("134")) {
            major = "Digital Technology in Mass Communication (DC)";
        }
        else if (code.equals("135")) {
            major = "Data Science and Data Analytics (DS)";
        }
        else {
            major = "Cannot found major";
        }


        JOptionPane.showMessageDialog(null, "Student ID: " + id + "\nMajor: " + major);

    }
}
