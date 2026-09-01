
import java.util.Scanner;

class AntiClockwise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        int temp = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
        for (int i : a) {
            System.out.println(i);
        }
    }
}
