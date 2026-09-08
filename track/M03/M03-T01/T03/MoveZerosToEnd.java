
import java.util.Scanner;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        int j = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
