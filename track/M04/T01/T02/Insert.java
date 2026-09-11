
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();
        String suffix = scanner.nextLine();

        StringBuilder builder = new StringBuilder(baseText);

        builder.insert(0, prefix + " ");
        builder.append(" " + suffix);
        System.out.println("Edited text: " + builder);
    }
}
