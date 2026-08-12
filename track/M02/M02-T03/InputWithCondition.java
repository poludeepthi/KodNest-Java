
import java.util.Scanner;

public class InputWithCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int practiceDays = scanner.nextInt();
        int total = 0;

        for (int i = 1; i <= practiceDays; i++) {
            int problemsSolved = scanner.nextInt();
            total += problemsSolved;
        }

        System.out.println("Total solved: " + total);

        if (total >= 20) {
            System.out.println("Status: " + "Strong progress");
        } else if (total >= 10 && total <= 19) {
            System.out.println("Status: " + "Keep improving");
        } else {
            System.out.println("Status: " + "Needs more practice");
        }

        scanner.close();
    }
}
