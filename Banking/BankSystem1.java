package Banking;

import java.util.Scanner;

public class BankSystem1 {

    public static String input_account_id(Scanner input) {
        while (true) {
            System.out.print("Enter account id: ");
            String accId = input.nextLine();
            if (accId.length() == 10) {
                return accId;
            }
        }
    }

    public static double input_initial_balance(Scanner input) {
        System.out.print("\nEnter your initial deposit amount: ");
        while (true) {
            String valStr = input.nextLine();
            try {
                return Double.parseDouble(valStr);
            } catch (NumberFormatException e) {
                System.out.print("Try again!! Enter your initial deposit amount: ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String account_bank = input_account_id(input);
        double initial_balance = input_initial_balance(input);

        System.out.println();

        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);
        System.out.println(account.recordAccount());

        input.close();
    }
}
