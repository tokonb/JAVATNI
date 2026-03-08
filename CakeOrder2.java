

import java.util.Scanner;

public class CakeOrder2 {

    public static String selectFlavor(Scanner input) {
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};
        while (true) {
            for (int i = 0; i < flavors.length; i++) {
                System.out.println("Press " + (i + 1) + " for " + flavors[i]);
            }
            System.out.print("Enter a flavor number: ");
            int choice = input.nextInt();
            if (choice >= 1 && choice <= flavors.length) {
                return flavors[choice - 1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.println("Press 3 to order Brownie");
        System.out.print("Enter an option: ");
        int option = input.nextInt();

        System.out.println();

        if (option == 1) {
            String flavor = selectFlavor(input);
            input.nextLine();
            System.out.print("\nEnter a message: ");
            String message = input.nextLine();
            System.out.print("How many pounds: ");
            double pounds = input.nextDouble();

            BirthdayCake cake = new BirthdayCake(message, pounds, flavor, 350.0);
            System.out.println("\n" + cake.toString());

        } else if (option == 2) {
            String flavor = selectFlavor(input);
            System.out.print("\nHow many pieces: ");
            int pieces = input.nextInt();

            CupCake cupCake = new CupCake(pieces, flavor, 70.0);
            System.out.println("\n" + cupCake.toString());

        } else if (option == 3) {
            String flavor = selectFlavor(input);
            System.out.print("\nExtra Chocolate (true/false): ");
            boolean extra = input.nextBoolean();
            System.out.print("How many pieces: ");
            int pieces = input.nextInt();

            Brownie brownie = new Brownie(pieces, extra, flavor, 50.0);
            System.out.println("\n" + brownie.toString());

        } else {
            System.out.println("Wrong option!! Try again!!");
        }

        input.close();
    }
}
