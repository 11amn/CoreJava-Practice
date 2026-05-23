package ControlConstructs;

import java.util.Scanner;

public class DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        if(day == 1) {
            System.out.println("Weekday");
        } else if (day == 2) {
            System.out.println("Weekday");
        } else if (day == 3) {
            System.out.println("Weekday");
        } else if (day == 4) {
            System.out.println("Weekday");
        } else if (day == 5) {
            System.out.println("Weekday");
        } else if (day == 6) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekend");
        }
    }
}
