
import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            sum += a[i];
        }

        System.out.println("Total: " + sum);
    }
}
