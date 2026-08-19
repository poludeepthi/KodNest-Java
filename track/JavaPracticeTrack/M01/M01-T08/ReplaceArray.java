
import java.util.Scanner;

public class ReplaceArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int a[] = new int[size];

        int target = scanner.nextInt();
        int replacement = scanner.nextInt();

        int count = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == target) {
                a[i] = replacement;
                count++;
            }
        }

        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
