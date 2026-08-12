
import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;
}

public class LearnerProfileObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner l = new Learner();
        l.id = scanner.nextInt();
        l.name = scanner.next();
        l.javaScore = scanner.nextInt();

        Learner l1 = new Learner();
        l1.id = scanner.nextInt();
        l1.name = scanner.next();
        l1.javaScore = scanner.nextInt();

        int newScore = scanner.nextInt();

        System.out.println("Before Update");
        System.out.println(l.id + " - " + l.name + " - " + l.javaScore);
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);

        l.javaScore = newScore;

        System.out.println("After Update");
        System.out.println(l.id + " - " + l.name + " - " + l.javaScore);
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
    }
}
