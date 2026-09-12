import java.util.*;
public class StringRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String rev = sb.toString();

        boolean res;
        if (word.equalsIgnoreCase(rev)) {
            res = true;
        } else {
            res = false;
        }

        System.out.println("Reversed: " + sb);
        System.out.println("Palindrome: " + res);
    }
}