
import java.util.Scanner;

public class ArrayStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= size - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
