package Labsheet09;

import javax.swing.JOptionPane;

public class TicketInfo {

    public static String select_showtime(Movie movie) {
        String message = movie.toString() + "\n" +
                "Press 1 to select show time = 13:00\n" +
                "Press 2 to select show time = 14:30\n" +
                "Press 3 to select show time = 15:00\n" +
                "Enter a number:";

        String choice = JOptionPane.showInputDialog(null, message);

        if (choice != null) {
            if (choice.equals("1")) {
                return "13:00";
            } else if (choice.equals("2")) {
                return "14:30";
            } else if (choice.equals("3")) {
                return "15:00";
            }
        }
        return "Error time";
    }

    public static String select_seat_number() {
        String row = JOptionPane.showInputDialog(null, "Select seat row [A-G]:");
        String number = JOptionPane.showInputDialog(null, "Select seat number [1-12]:");

        String seatRow = (row != null) ? row.toUpperCase() : "";
        String seatNum = (number != null) ? number : "";

        return seatRow + seatNum;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 120, "PG-13");

        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();

        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240.0);

        JOptionPane.showMessageDialog(null, ticket.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
