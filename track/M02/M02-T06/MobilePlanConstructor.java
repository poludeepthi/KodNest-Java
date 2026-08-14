
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class MobilePlanConstructor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        MobilePlan mobile = new MobilePlan();
        MobilePlan mobile1 = new MobilePlan(planName, price);

        mobile.display();
        mobile1.display();
    }
}
