package TakingUserInput.CalciProject;

import java.util.Scanner;

public class CalciRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scan.nextInt();

        System.out.println("Enter Second Number: ");
        int b = scan.nextInt();

        CalculatorProject cp = new CalculatorProject();

        System.out.println("Addition: " + cp.add(a,b));
        System.out.println("Subtraction: " + cp.sub(a,b));
        System.out.println("Multiplication: " + cp.multiply(a,b));
        System.out.println("Division: " + cp.div(a,b));
    }
}
