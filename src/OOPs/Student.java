package OOPs;

public class Student {
    int roll;
    String name;
    int marks;
    void study() {
        System.out.println("Studying");
    }
    void sleep() {
        System.out.println("Sleeping");
    }
    void eat() {
        System.out.println("Eating");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 12;
        s1.name = "Raju";
        s1.marks = 99;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.study();
        s1.sleep();
        s1.eat();
    }
}
