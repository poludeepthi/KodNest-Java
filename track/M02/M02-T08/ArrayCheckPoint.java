
import java.util.Scanner;

public class ArrayCheckPoint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }

        int total = 0;
        System.out.print("Array total: ");

        for (int i = 0; i <= arr.length - 1; i++) {
            total = total + arr[i];
        }

        System.out.println(total);

        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int matrix[][] = new int[rows][columns];

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int matrixtotal = 0;

        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                matrixtotal = matrixtotal + matrix[i][j];
            }
        }

        System.out.println("Matrix total: " + matrixtotal);
    }
}
