
import java.util.Scanner;

public class LearnerProgress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int practiceDays = scanner.nextInt();
        int total = 0;

        for (int i = 1; i <= practiceDays; i++) {
            int problemsSolved = scanner.nextInt();
            total += problemsSolved;
        }

        double average = (double) total / practiceDays;

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + average);

        if (average >= 5.0) {
            System.out.println("Status: " + "Consistent");
        } else {
            System.out.println("Status: " + "Needs consistency");
        }

        scanner.close();
    }
}
