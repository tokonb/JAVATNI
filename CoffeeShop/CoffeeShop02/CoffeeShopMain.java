package CoffeeShop02;

import java.util.Scanner;

public class CoffeeShopMain {
    static Scanner input = new Scanner(System.in);

    public static Espresso orderEspresso() {
        System.out.print("Enter a size: ");
        String size = input.next();

        Espresso esp = new Espresso(size);

        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String choice = input.next();

        if (choice.equalsIgnoreCase("y")) {
            System.out.print("How many shots for adding in Espresso: ");
            int shots = input.nextInt();
            esp.addShot(shots);
        }

        return esp;
    }

    public static Frappuccino orderFrappucino() {
        System.out.print("Enter a size: ");
        String size = input.next();

        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String choice = input.next();

        boolean whipped = choice.equalsIgnoreCase("y");

        return new Frappuccino(size, whipped);
    }

    public static void main(String[] args) {
        int espressoCount = 0;
        int frappuccinoCount = 0;
        double totalPrice = 0;
        boolean keepOrdering = true;

        do {
            System.out.println("Press 1 for ordering Espresso");
            System.out.println("Press 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");

            String option = input.next();

            if (option.equals("1")) {
                Espresso order = orderEspresso();
                System.out.println(order.toString());
                System.out.println();

                espressoCount++;
                totalPrice += order.calculateFinalPrice();

            } else if (option.equals("2")) {
                Frappuccino order = orderFrappucino();
                System.out.println(order.toString());
                System.out.println();

                frappuccinoCount++;
                totalPrice += order.calculateFinalPrice();

            } else {
                keepOrdering = false;
                break;
            }

            System.out.print("Do you want to order more [y/Y]? ");
            String more = input.next();
            if (!more.equalsIgnoreCase("y")) {
                keepOrdering = false;
            }
            System.out.println();

        } while (keepOrdering);

        System.out.println("You ordered " + espressoCount + " Espresso");
        System.out.println("You ordered " + frappuccinoCount + " Frappuccino");
        System.out.println("Total Price = " + totalPrice);
    }
}
