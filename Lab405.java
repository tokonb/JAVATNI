import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        // รับค่าประโยคแรกเริ่ม
        System.out.print("Input some sentence: ");
        String InputSentence = Keyboard.nextLine();

        // ตรวจสอบว่าลงท้ายด้วย . หรือไม่ ถ้าไม่ให้วนรับใหม่
        while (InputSentence.endsWith(".") == false)
        {
            System.out.print("The sentence must end with full stop point: ");
            InputSentence = Keyboard.nextLine();
        }

        // ตัดคำด้วยช่องว่าง (Space)
        String[] Words = InputSentence.split(" ");

        // วนลูปแสดงผลทีละคำ
        for (int i = 0; i < Words.length; i++)
        {
            System.out.println(Words[i]);
        }
    }
}