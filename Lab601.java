import java.util.Scanner;

public class Lab601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            while (numbers[i] <= 0) {
                System.out.print("The number must be positive! Enter number again: ");
                numbers[i] = sc.nextInt();
            }
        }

        System.out.print("\nList of even number: ");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        System.out.print("\nList of odd  number: ");
        for (int n : numbers) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}