
class Robot {

    void speak() {
        System.out.println("Beep beep! Java is my superpower!");
    }
}

public class CallMethod {

    public static void main(String[] args) {
        Robot r = new Robot();
        r.speak();
    }
}
