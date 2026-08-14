
import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Student s1 = new Student(name);

        s1.display();
    }
}
