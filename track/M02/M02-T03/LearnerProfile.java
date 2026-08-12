
import java.util.Scanner;

public class LearnerProfile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fName = scan.next();
        System.out.println("Learner: " + fName);

        int problemSolved = scan.nextInt();
        System.out.println("Problems solved: " + problemSolved);

        double percentage = scan.nextDouble();
        System.out.println("Assessment: " + percentage);
    }
}
