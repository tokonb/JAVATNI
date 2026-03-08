package Labsheet09;

import javax.swing.JOptionPane;

public class TicketUsed {

    public static String show_movie_list(Ticket... tickets) {
        StringBuilder list = new StringBuilder();
        for (Ticket t : tickets) {
            list.append(t.getTicket_id()).append(": ").append(t.getMovie().toString()).append("\n");
        }
        return list.toString();
    }

    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        int startChoice = JOptionPane.showConfirmDialog(null, "Do you want to book or use a ticket?", "Ticket", JOptionPane.YES_NO_OPTION);

        if (startChoice == JOptionPane.YES_OPTION) {
            boolean isRunning = true;

            while (isRunning) {
                String movieList = show_movie_list(tickets);
                String ticketIdInput = JOptionPane.showInputDialog(null, movieList + "\nEnter a ticket id for booking:");

                if (ticketIdInput != null && !ticketIdInput.trim().isEmpty()) {
                    Ticket selectedTicket = null;
                    for (Ticket t : tickets) {
                        if (t.getTicket_id().equalsIgnoreCase(ticketIdInput.trim())) {
                            selectedTicket = t;
                            break;
                        }
                    }

                    if (selectedTicket != null) {
                        String menuMessage = selectedTicket.getTicket_id() + ": " + selectedTicket.getMovie().toString() + "\n\n" +
                                "Press 1 to book a ticket\n" +
                                "Press 2 to use a ticket\n" +
                                "Press 3 to see a ticket status\n\n" +
                                "Enter a menu:";

                        String menuInput = JOptionPane.showInputDialog(null, menuMessage);

                        if (menuInput != null) {
                            if (menuInput.equals("1")) {
                                String result = selectedTicket.bookTicket();
                                JOptionPane.showMessageDialog(null, result + "\n------------------------------\n" + selectedTicket.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                            } else if (menuInput.equals("2")) {
                                String result = selectedTicket.useTicket();
                                JOptionPane.showMessageDialog(null, result + "\n------------------------------\n" + selectedTicket.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                            } else if (menuInput.equals("3")) {
                                JOptionPane.showMessageDialog(null, selectedTicket.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }

                int continueChoice = JOptionPane.showConfirmDialog(null, "Do you want to book or use other tickets?", "Ticket", JOptionPane.YES_NO_OPTION);
                if (continueChoice != JOptionPane.YES_OPTION) {
                    isRunning = false;
                }
            }
        }
    }
}
