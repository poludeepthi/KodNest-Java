
import java.util.Scanner;

public class TraceString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        System.out.println("Original: " + original);
        original.toUpperCase();
        System.out.println("After ignored call: " + original);
        String res = original.toUpperCase();
        System.out.println("Uppercase copy: " + res);
    }
}
