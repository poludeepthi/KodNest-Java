
import java.util.Scanner;

public class ArrayIdentical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a1[] = new int[n];
        for (int i = 0; i <= a1.length - 1; i++) {
            a1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int a2[] = new int[m];

        for (int i = 0; i <= a2.length - 1; i++) {
            a2[i] = scanner.nextInt();
        }

        boolean identical = true;

        if (a1.length != a2.length) {
            identical = false;
        } else {
            for (int i = 0; i <= a1.length - 1; i++) {
                if (a1[i] != a2[i]) {
                    identical = false;
                    break;
                }
            }
        }

        if (identical) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
