
import java.util.*;

class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        char revarr[] = new char[arr.length];
        int j = revarr.length - 1;
        for (int i = 0; i <= arr.length - 1; i++) {
            revarr[j] = arr[i];
            j--;
        }
        String revStr = new String(revarr);
        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("it is apalindrome....");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
