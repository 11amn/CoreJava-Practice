package ControlConstructs;

import java.util.Scanner;

public class NumberSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        if (num < 10) {
            System.out.println("Small Number");
        } else if (num >= 10 && num < 100) {
            System.out.println("Medium Number");
        } else if (num >= 100) {
            System.out.println("Large Number");
        }
    }
}
