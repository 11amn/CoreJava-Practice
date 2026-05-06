package ControlConstructs;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkSeniorCitizen(age);
    }

    public static void checkSeniorCitizen(int age) {
        if (age >= 60) {
            System.out.println("Senior Citizen");
        } else if (age < 60) {
            System.out.println("Not Senior Citizen");
        }
    }
}
