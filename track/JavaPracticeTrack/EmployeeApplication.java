
class EmployeeApplication {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 10;
        e1.name = "deepthi";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();
        Employee e2;
        e2 = e1;
        e2.id = 11;
        e2.name = "padma";
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e1.id);
        System.out.println(e1.name);
    }
}

class Employee {

    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}
