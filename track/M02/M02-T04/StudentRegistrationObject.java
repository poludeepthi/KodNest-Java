
import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentRegistrationObject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s = new Student();
        s.registrationId = scanner.nextInt();
        s.name = scanner.next();
        s.attendancePercentage = scanner.nextDouble();

        Student s1 = new Student();
        s1.registrationId = scanner.nextInt();
        s1.name = scanner.next();
        s1.attendancePercentage = scanner.nextDouble();

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        if (selectedId == s.registrationId) {
            selectedStudent = s;
        } else if (selectedId == s1.registrationId) {
            selectedStudent = s1;
        }

        if (selectedStudent == null) {
            System.out.println("Student not found.");
        } else {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        }

        System.out.println(s.registrationId + " - " + s.name + " - " + s.attendancePercentage);
        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage);
    }
}
