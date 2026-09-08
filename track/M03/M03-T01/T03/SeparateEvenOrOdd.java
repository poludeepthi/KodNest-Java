
import java.util.Scanner;

public class SeparateEvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            while (i < j && a[i] % 2 == 0) {
                i++;
            }

            while (i < j && a[j] % 2 != 0) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        for (int k = 0; k <= a.length - 1; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
