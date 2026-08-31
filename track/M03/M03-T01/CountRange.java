
import java.util.Scanner;

public class CountRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        int count = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] >= lower && a[i] <= upper) {
                count++;
            }
        }

        System.out.println(count);
    }
}
