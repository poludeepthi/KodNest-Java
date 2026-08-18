
import java.util.Scanner;

class SumOfArray {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Array elements are; ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
    }

}
