package OOPs;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Amait";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.work();

        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "Suraj";
        System.out.println(e2.id);
        System.out.println(e2.name);
        e2.work();
    }
}
