
import java.util.Scanner;

class UserInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter byte value: ");
        byte a = scan.nextByte();
        System.out.println("Byte value: " + a);
        System.out.println("Enter float value:");
        float b = scan.nextShort();
        System.out.println("Float value is: " + b);
        System.out.println("Enter the short value:");
        short c = scan.nextShort();
        System.out.println("Short value is:" + c);
        System.out.println("Enter int value");
        int d = scan.nextInt();
        System.out.println("Integer value is : " + d);
        System.out.println("Enter the long value");
        long e = scan.nextLong();
        System.out.println("Long value is:" + e);
        System.out.println("Enter double value:");
        double f = scan.nextDouble();
        System.out.println("Double value is :" + f);
        System.out.println("Enter boolean value:");
        boolean g = scan.nextBoolean();
        System.out.println("Boolean value is:" + g);
    }
}
