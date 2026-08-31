
import java.util.Scanner;

public class MinMaxDiff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int max = a[0];
        int min = a[0];

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] >= max) {
                max = a[i];
            } else if (a[i] <= min) {
                min = a[i];
            }
        }

        System.out.println(max - min);
        scanner.close();
    }
}
