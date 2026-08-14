
import java.util.Scanner;

class CabBooking {

    String passengerName;
    String cabType;
    int distance;
    int fare;

    CabBooking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}

public class CabBookings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            String passengerName = scan.nextLine();
            CabBooking c = new CabBooking(passengerName);
            c.displayBooking();
        } else if (choice == 2) {
            String passengerName = scan.nextLine();
            String cabType = scan.nextLine();
            int distance = scan.nextInt();

            CabBooking b = new CabBooking(passengerName, cabType, distance);
            b.displayBooking();
        }
    }
}
