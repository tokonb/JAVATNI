import java.util.Scanner;
import java.util.Random;
public class Lab603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = random_array();

        System.out.print("Enter your guess (0-20): ");
        int guess_number = sc.nextInt();

        int count = count_element(numbers, guess_number);
        if (count > 0) {

            System.out.println("Congratulations!! " + guess_number + " is an element in the array!!");

            if (count > 1) {
                System.out.println("Fantastic!! It also appears more than once!!");
            }
        } else {

            System.out.println("Sorry, try again next time...");
            display_array(numbers);
        }
    }
    public static int[] random_array() {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(21);
        }
        return arr;
    }
    public static void display_array(int[] numbers) {
        System.out.print("Here are the elements in the array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int count_element(int[] numbers, int element) {
        int count = 0;
        for (int num : numbers) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }
}