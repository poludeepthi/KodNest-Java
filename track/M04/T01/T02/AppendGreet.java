
import java.util.Scanner;

public class AppendGreet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        StringBuilder build = new StringBuilder();
        build.append("Hello, ");
        build.append(learnerName);
        build.append("!");

        System.out.println(build);
    }
}
