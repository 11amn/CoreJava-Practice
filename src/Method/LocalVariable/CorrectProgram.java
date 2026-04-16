package Method.LocalVariable;

public class CorrectProgram {
    public static void main(String[] args) {
        String fName = "Ajay";
        String lName = "Singh";
        String fullName = printName(fName, lName);
        System.out.println(fullName);
    }

    static String printName(String firstName, String lastName) {
        String fullName = firstName + lastName;
        return fullName;
    }
}
