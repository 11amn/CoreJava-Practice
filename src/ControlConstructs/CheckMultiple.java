package ControlConstructs;

import java.util.Scanner;

public class CheckMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkMultipleOfFive(number);
    }

    public static void checkMultipleOfFive(int number) {
        if(number % 5 == 0) {
            System.out.println("Multiple of 5");
        }
        System.out.println("Program ended");
    }
}
