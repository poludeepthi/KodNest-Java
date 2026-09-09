
import java.util.Scanner;

public class NormalizeString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        String result = sentence.trim().toLowerCase();
        String res = keyword.trim().toLowerCase();
        boolean finalResult = result.contains(res);

        System.out.println("Normalized text: " + result);
        System.out.println("Contains keyword: " + finalResult);
    }
}
