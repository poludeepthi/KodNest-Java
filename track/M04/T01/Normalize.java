
import java.util.Scanner;

public class Normalize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        String res = learnerName.trim().toUpperCase();
        System.out.println("Normalized name: " + res);
    }
}
