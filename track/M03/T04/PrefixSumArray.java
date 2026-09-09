
import java.util.Scanner;

public class PrefixSumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long value = scanner.nextLong();
            sum += value;
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(sum);
        }
    }
}
