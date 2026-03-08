import java.util.Scanner;

public class Lab504 {

    public static boolean check_password(String pass) {
        return pass.length() > 8;
    }

    public static boolean check_password(String pass, String confirm_pass) {
        return pass.equals(confirm_pass);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Create password: ");
        String pass = input.nextLine();

        while (!check_password(pass)) {
            System.out.print("Invalid Password! Create password: ");
            pass = input.nextLine();
        }

        System.out.print("\nEnter confirm password: ");
        String confirm = input.nextLine();

        while (!check_password(pass, confirm)) {
            System.out.print("Password do not match! Enter confirm password: ");
            confirm = input.nextLine();
        }

        System.out.println("\nPassword set successfully!!");

        input.close();
    }
}
