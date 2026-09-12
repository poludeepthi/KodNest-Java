
import java.util.Scanner;

public class Anagramchecking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        boolean res;
        if (first.length() != second.length()) {
            res = false;
            System.out.println("Anagram: " + res);
            return;
        }

        StringBuilder sb = new StringBuilder(second);
        res = true;

        for (int i = 0; i < first.length(); i++) {
            String ch = String.valueOf(first.charAt(i));
            int index = sb.indexOf(ch);

            if (index == -1) {
                res = false;
                break;
            }

            sb.deleteCharAt(index);
        }

        System.out.println("Anagram: " + res);
    }
}
