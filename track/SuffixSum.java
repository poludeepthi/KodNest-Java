
import java.util.*;

class SuffixSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        long suffix[] = new long[a.length];
        suffix[a.length - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + a[i];
        }
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(suffix[i]);
        }
    }
}
