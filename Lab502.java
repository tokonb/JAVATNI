import javax.swing.JOptionPane;

public class Lab502 {

    public static String find_grade(int score) {
        if (score >= 80 && score <= 100) return "A";
        if (score >= 70 && score <= 79) return "B";
        if (score >= 60 && score <= 69) return "C";
        if (score >= 50 && score <= 59) return "D";
        return "F";
    }

    public static int cal_score(int midterm, int Final) {
        return midterm + Final;
    }

    public static int input_score(String message, int limit_score) {
        String input = JOptionPane.showInputDialog(null, message);
        if (input == null) System.exit(0);
        int score = Integer.parseInt(input);

        while (score < 0 || score > limit_score) {
            input = JOptionPane.showInputDialog(null, "Score must be in range between 0 and " + limit_score + "\n" + message);
            if (input == null) System.exit(0);
            score = Integer.parseInt(input);
        }
        return score;
    }

    public static void main(String[] args) {
        while (true) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to check your score?", "Check score", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                int mid = input_score("Enter midterm-score:", 45);
                int fin = input_score("Enter final-score:", 55);

                int total = cal_score(mid, fin);
                String grade = find_grade(total);

                JOptionPane.showMessageDialog(null, "Your score is " + total + "\nYou get grade " + grade, "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}
