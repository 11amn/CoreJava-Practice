package Operator;

public class Ternary {
    public static void main(String[] args) {

        // Condition ? value1 : value2
        var age = 20;
        var message = (age >= 18) ? "You are an adult." : "You are not an adult.";
        System.out.println(message);

        var x = 10;
        var y = 5;
        var result = (x > y) ? (x + y)*2 : (x - y)/2;
        System.out.println("Result: " + result);
    }
}
