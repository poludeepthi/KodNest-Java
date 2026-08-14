
class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "varshini";
        age = 22;
        height = 4.7;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

class ConstructorOverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("deepthi");
        Student s3 = new Student("varshini", 22, 4.8);
        s1.display();
        s2.display();
        s3.display();
    }
}
