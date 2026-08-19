
import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int a[][] = new int[rows][columns];

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                if (a[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);
    }
}
