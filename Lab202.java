import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = Integer.parseInt(scan.next());
        System.out.print("Enter number 2: ");
        double num2 = Integer.parseInt(scan.next());




        System.out.print("\nSummation = " + (num1 + num2));
        System.out.println("\nSubtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));
        System.out.println("Division = " + (num1 / num2));
        System.out.println("Modulus = " + (num1 % num2));



    }
}
