package Method;

public class Cafeteria {

    // Type-2 Method with parameters but without a return value
    static void prepareChai(String sugarPreference, int numOfCups) {

        System.out.println("Preparing " + numOfCups + " cups of chai with " + sugarPreference + " sugar.");
    }

    public static void main(String[] args) {
        // Calling the method with different parameters
        prepareChai("less", 2);
        prepareChai("extra",4);
    }
}
