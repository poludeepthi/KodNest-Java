
import java.util.Scanner;

class AddElementIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        int b[] = new int[a.length - 1];
        int index = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        for (int i = index; i < a.length - 1; i++) {
            b[i] = a[i + 1];
        }
        for (int i : b) {
            System.out.println(i);
        }
    }
}
