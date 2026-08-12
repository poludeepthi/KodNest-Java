
import java.util.Scanner;

public class PersonalExpenseCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rentExpenses = scanner.nextDouble();
        double foodExpenses = scanner.nextDouble();
        double travelExpenses = scanner.nextDouble();
        double totalExpenses = rentExpenses + foodExpenses + travelExpenses;
        double remainingAmount = monthlyIncome - totalExpenses;

        System.out.println("Total expense: " + totalExpenses);
        System.out.println("Remaining: " + remainingAmount);

        if (remainingAmount >= 0) {
            System.out.println("Status: " + "Within budget");
        } else {
            System.out.println("Status: " + "Over budget");
        }

        scanner.close();
    }
}
