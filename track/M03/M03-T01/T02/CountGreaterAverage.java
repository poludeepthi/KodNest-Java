
import java.util.Scanner;

public class CountGreaterAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        long sum = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }

        double average = (double) sum / n;
        int count = 0;

        for (int i : a) {
            if (i > average) {
                count++;
            }
        }

        System.out.println(count);
    }
}
