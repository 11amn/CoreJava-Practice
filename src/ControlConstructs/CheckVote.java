package ControlConstructs;

public class CheckVote {
    public static void main(String[] args) {
        //Hardcoded age Input
        int age = 20;

        //Using Ternary Operator
        String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(eligibility);
    }
}
