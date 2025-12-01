import java.util.Scanner;

import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int number = scan.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= number; i++){
            System.out.print("Enter number " + i + ": ");
            int num1 = scan.nextInt();


            if (num1 > max){
                max = num1;

            }
            if (num1 < min){
                min = num1;
            }
            if (num1 % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);
    }
}