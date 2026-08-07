
import java.util.Scanner;

class NextLine {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age:");
        int age = scan.nextInt();
        System.out.println("Age is: " + age);
        System.out.println("Enter the height:");
        float height = scan.nextFloat();
        System.out.println("Height is :" + height);
        scan.nextLine();
        System.out.println("Enter the FullName");
        String fName = scan.nextLine();
        System.out.println("FullName is :" + fName);
    }
}
