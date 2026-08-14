
import java.util.*;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class ParameterConstructor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product p = new Product(scanner.nextLine(), scanner.nextDouble());

        p.display();
    }
}
