
import java.util.Scanner;

class CharInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Char");
        char ch = scan.next().charAt(3);
        System.out.println(ch);
    }
}
