package Banking;

import java.util.Scanner;

public class BankSystem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your bank account: ");
        String accId = input.nextLine();

        AccountTransaction account = new AccountTransaction(accId);

        if (account.hasAccountId()) {
            System.out.println("\nPress 1 to deposit");
            System.out.println("Press 2 to withdraw");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to exit\n");

            while (true) {
                System.out.print("Enter a menu: ");
                String menuStr = input.nextLine();
                int menu;
                try {
                    menu = Integer.parseInt(menuStr);
                } catch (NumberFormatException e) {
                    System.out.println();
                    continue;
                }

                if (menu == 1) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = Double.parseDouble(input.nextLine());
                    account.deposit(amount);
                    System.out.println("Your balance = " + account.checkBalance() + "\n");
                } else if (menu == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = Double.parseDouble(input.nextLine());
                    account.withdraw(amount);
                    System.out.println("Your balance = " + account.checkBalance() + "\n");
                } else if (menu == 3) {
                    System.out.println("Your balance = " + account.checkBalance() + "\n");
                } else if (menu == 4) {
                    break;
                } else {
                    System.out.println();
                }
            }
        } else {
            System.out.println("\nBank account not found...");
        }

        input.close();
    }
}
