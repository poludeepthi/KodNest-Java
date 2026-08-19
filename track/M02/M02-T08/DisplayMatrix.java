
import java.util.Scanner;

public class DisplayMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int arr[][] = new int[rows][columns];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
