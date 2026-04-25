package TakingUserInput;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Age: " + age);

        scan.nextLine(); // Reading new line character

        System.out.println("Enter your full Name");
        String fullName = scan.nextLine(); // Reading full name
        System.out.println("Full Name: " + fullName);

        System.out.println("Enter your height");
        float height = scan.nextInt();
        System.out.println("Height: " + height);
    }
}
