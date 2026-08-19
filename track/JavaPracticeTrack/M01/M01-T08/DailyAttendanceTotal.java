
import java.util.Scanner;

public class DailyAttendanceTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classes = scanner.nextInt();
        int days = scanner.nextInt();
        int[][] attendance = new int[classes][days];

        for (int i = 0; i <= attendance.length - 1; i++) {
            for (int j = 0; j <= attendance[i].length - 1; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i <= days - 1; i++) {
            int total = 0;

            for (int j = 0; j <= classes - 1; j++) {
                total = total + attendance[j][i];
            }

            System.out.println("Day " + (i + 1) + " total: " + total);
        }
    }
}
