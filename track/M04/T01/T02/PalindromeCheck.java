
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder sb = new StringBuilder(word).reverse();
        String rev = sb.toString();
        boolean res;

        if (word.equals(rev)) {
            res = true;
        } else {
            res = false;
        }

        System.out.println("Palindrome: " + res);
    }
}
