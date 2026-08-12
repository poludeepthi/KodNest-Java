
import java.util.Scanner;

public class NumberRangeAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                count++;
            }
        }

        System.out.println("Even sum: " + sum);
        System.out.println("Odd count: " + count);

        scanner.close();
    }
}
