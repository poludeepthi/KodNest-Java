
class Student {

    String name;
    int age;
    double height;

    public Student(String name, int age, double height) {
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

class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student("deepa", 20, 4.6);
        s1.display();
    }
}
