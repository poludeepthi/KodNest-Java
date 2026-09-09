
import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int vowelCount = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            char ch = text.toLowerCase().charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
    }
}
