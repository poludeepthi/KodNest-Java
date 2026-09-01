
import java.util.Scanner;

public class SequenceMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
