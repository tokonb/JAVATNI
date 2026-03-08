package Labsheet08;

import javax.swing.JOptionPane;

public class BookInventory {

    public static void main(String[] args) {

        Book[] books = new Book[3];

        for (int i = 0; i < books.length; i++) {
            String title = JOptionPane.showInputDialog(null, "Enter book title:");

            String totalInput = JOptionPane.showInputDialog(null, "Enter the total number:");
            int totalBook = Integer.parseInt(totalInput);

            books[i] = new Book(title, totalBook);
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle() + " has " + books[i].getTotalBook() + " books, can borrow " + books[i].getAvailableBook() + " books.");
        }
    }
}