
import java.util.Scanner;

public class SearchAndReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int targetValues = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i <= size - 1; i++) {
            if (arr[i] == targetValues) {
                System.out.println("Found");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
