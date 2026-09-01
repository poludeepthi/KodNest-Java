
import java.util.Scanner;

public class FirstLastOcurrence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int first = -1;
        int last = -1;

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println(first + " " + last);
    }
}
