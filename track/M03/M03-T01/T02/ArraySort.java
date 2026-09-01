
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int sort = 1;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                sort = 0;
                break;
            }
        }

        if (sort == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
