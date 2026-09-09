
import java.util.Scanner;

public class MaxSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        int k = scanner.nextInt();
        long windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        long maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        System.out.println(maxSum);
    }
}
