
import java.util.Scanner;

public class MonthlySalesReport {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int a[][] = new int[rows][columns];

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i <= a.length - 1; i++) {
            int total = 0;

            for (int j = 0; j <= a[i].length - 1; j++) {
                total = total + a[i][j];
            }

            System.out.println("Product " + (i + 1) + " total: " + total);
        }
    }
}
