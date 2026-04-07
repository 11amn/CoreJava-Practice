package DataTypes;

import java.net.ServerSocket;

public class UserRegister {
    public static void main(String[] args) {
        String name = "John Doe";
        String email = "john.doe@gmail.com";
        String dob = "01/01/1990";
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dob);
        char gender = 'M';
        System.out.println("Gender: " + gender);
        boolean isEmployed = false;
        System.out.println("Employed: " + isEmployed);
    }
}
