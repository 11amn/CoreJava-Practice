package TakingUserInput;

import java.util.Scanner;

public class UserInformationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte userId = scanner.nextByte();

        short age = scanner.nextShort();

        int phoneNumber = scanner.nextInt();

        long nationalId = scanner.nextLong();

        float height = scanner.nextFloat();

        double weight = scanner.nextDouble();

        char gender = scanner.next().charAt(0);

        boolean isMarried = scanner.nextBoolean();

        scanner.nextLine(); // Consume the newline left-over
        String name = scanner.nextLine();

        System.out.println("User Information:");
        System.out.println("User Id: " + userId);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("National ID: " + nationalId);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + isMarried);
        System.out.println("Name: " + name);
    }
}
