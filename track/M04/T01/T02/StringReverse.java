
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
