
import java.util.Scanner;

public class FrequencyReport {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i <= size - 1; i++) {
            arr[i] = scan.nextInt();
        }

        int targetValues = scan.nextInt();
        int count = 0;

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == targetValues) {
                count++;
            }
        }

        System.out.println("Frequency of " + targetValues + ": " + count);
    }
}
