
class Conductor {

    void collect(Money m) {
        System.out.println("Money collected by the conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;
    }
}

class Money {
}

class Ticket {
}

class Passenger {

    public static void main(String[] args) {
        Conductor c = new Conductor();
        Money m = new Money();
        c.collect(m);
        Ticket t = c.give();
        System.out.println(t);
        if (t != null) {
            System.out.println("Ticket collected");

        }
    }

}
