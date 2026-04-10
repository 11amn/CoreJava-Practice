package Method;

public class Cafe {

    //Type-3 Method without parameters but with a return value
    static int getChaiCount() {
        return 10; // Returning the number of chai cups available
    }

    public static void main(String[] args) {
        int chaiCount = getChaiCount();
        System.out.println("Number of chai cups available: " + chaiCount);
    }
}
