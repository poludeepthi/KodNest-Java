
import java.util.Scanner;

public class Append {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String courseName = scanner.nextLine();

        StringBuilder builder = new StringBuilder();

        builder.append("Learner: " + learnerName);
        builder.append(" | ");
        builder.append("Course: " + courseName);
        System.out.print(builder);
    }
}
