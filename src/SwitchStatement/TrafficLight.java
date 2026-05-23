package SwitchStatement;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char lightColor = sc.next().charAt(0);
        performAction(lightColor);
        sc.close();
    }
    public static void performAction(char lightColor) {
        switch (lightColor) {
            case 'R':
                System.out.println("Stop");
                break;
            case 'Y':
                System.out.println("Wait");
                break;
            case 'G':
                System.out.println("Go");
        }
    }
}
