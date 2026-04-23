package TakingUserInput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a byte value");
        byte a = sc.nextByte();
        System.out.println(a);

        System.out.println("Enter a short value");
        short b = sc.nextShort();
        System.out.println(b);

        System.out.println("Enter an int value");
        int c = sc.nextInt();
        System.out.println(c);

        System.out.println("Enter a long value");
        long d = sc.nextLong();
        System.out.println(d);

        System.out.println("Enter a float value");
        float e = sc.nextFloat();
        System.out.println(e);

        System.out.println("Enter a double value");
        double f = sc.nextDouble();
        System.out.println(f);

        System.out.println("Enter a boolean value");
        boolean g = sc.nextBoolean();
        System.out.println(g);
    }
}
