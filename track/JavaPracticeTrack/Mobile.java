
import java.util.*;

class Mobile {

    public static void main(String[] args) {
        MobileApp m = new MobileApp();
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int pin = scanner.nextInt();
        Face f = new Face();
        Finger f1 = new Finger();
        Pattern p = new Pattern();
        m.password(password);
        m.password(p);
        m.password(pin);
        m.password(f);
        m.password(f1);
    }
}

class MobileApp {

    void password(String password) {
        System.out.println("The password is: " + password);
    }

    void password(Pattern p) {
        System.out.println("The pattern is found");
    }

    void password(int pin) {
        System.out.println("The pin is: " + pin);
    }

    void password(Face f) {
        System.out.println("face is recognized");
    }

    void password(Finger f1) {
        System.out.println("finger print detected");
    }
}

class Face {
}

class Finger {
}

class Pattern {
}
