
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class CalculateTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();

        ResultCalculator r = new ResultCalculator();

        int res = r.getTotal(mark1, marks2);
        int res1 = r.getTotal(mark1, marks2, marks3);

        System.out.println("Two-Mark Total: " + res);
        System.out.println("Three-Mark Total: " + res1);
    }
}
