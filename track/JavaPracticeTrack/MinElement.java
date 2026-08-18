
import java.util.Scanner;

class MinElement {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array elemnts:");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        int min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min element: " + min);

    }

}
