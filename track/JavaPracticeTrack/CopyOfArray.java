
import java.util.Scanner;

class CopyOfArray {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        int b[] = new int[5];
        System.out.println("Enter the array elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        int j = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            b[j] = a[i];
            j++;
        }
        System.out.println("Elemnts of a are:");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        System.out.println("elements in b are:");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(b[i]);
        }

    }

}
