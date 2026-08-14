
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class FoodOrderOverLoadConstructor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        FoodOrder food = new FoodOrder(item);
        FoodOrder foods = new FoodOrder(item, quantity);

        food.display();
        foods.display();
    }
}
