import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        String FullSentence = "";

        while (true)
        {
            System.out.print("Enter word: ");
            String CurrentWord = Keyboard.next();

            if (CurrentWord.equalsIgnoreCase("stop")) break;

            FullSentence = FullSentence + CurrentWord + " ";
        }

        System.out.println(FullSentence.trim());
    }
}
