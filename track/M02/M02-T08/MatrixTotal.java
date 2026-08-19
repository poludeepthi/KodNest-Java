
import java.util.Scanner;

public class MatrixTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }

        for (int row = 0; row < rows; row++) {
            int rowTotal = 0;

            for (int column = 0; column < columns; column++) {
                rowTotal = rowTotal + matrix[row][column];
            }

            System.out.println("Row " + (row + 1) + " total: " + rowTotal);
        }
    }
}
