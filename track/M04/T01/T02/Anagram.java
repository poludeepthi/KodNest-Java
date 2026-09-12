
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        boolean res;
        if (first.length() != second.length()) {
            res = false;
            System.out.println("Anagram: " + res);
            return;
        }

        StringBuilder builder = new StringBuilder(second);
        res = true;

        for (int i = 0; i < first.length(); i++) {
            String character = String.valueOf(first.charAt(i));
            int index = builder.indexOf(character);

            if (index == -1) {
                res = false;
                break;
            }

            builder.deleteCharAt(index);
        }

        System.out.println("Anagram: " + res);
    }
}
