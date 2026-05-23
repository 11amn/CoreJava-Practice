package SwitchStatement;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        switch (num) {
            case 1 : System.out.println("ONE");
            break;
            case 2 : System.out.println("TWO");
            break;
            case 3 : System.out.println("THREE");
            break;
            case 4 : System.out.println("FOUR");
            break;
            default: System.out.println("Invalid Number");
        }
    }
}
