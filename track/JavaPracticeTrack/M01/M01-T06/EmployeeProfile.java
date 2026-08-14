
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void displayProfile() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class EmployeeProfile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int id = scan.nextInt();
        String name = scan.next();
        String department = scan.next();

        Employee e = new Employee(id, name, department);
        e.displayProfile();
    }
}
