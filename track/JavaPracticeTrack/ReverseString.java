
import java.util.*;

class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char arr[] = str.toCharArray();
        char newArr[] = new char[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            newArr[j] = arr[i];
            j--;
        }
        String rev = new String(newArr);
        System.out.println("original string: " + str);
        System.out.println("reverse string is: " + rev);
    }
}
