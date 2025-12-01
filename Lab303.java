import java.util.Scanner;
public class Lab303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for X coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int y = sc.nextInt();
        if (x == 0 && y == 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Origin");
        } else if (x > 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("The coordinate point (" + x + "," + y + ") lies in the Fourth quadrant");
        }
    }
}
