
import java.util.*;

class PrefixSubArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        long prefix[] = new long[a.length];
        prefix[0] = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(prefix[i]);
        }
    }
}
