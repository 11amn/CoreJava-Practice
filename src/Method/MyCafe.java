package Method;

public class MyCafe {

    // Type-4 Method with parameters and a return value
    static int calculateTotalCost(int pricePerItem, int quantity) {
        int totalCost = pricePerItem * quantity;
        return totalCost; // Returning the calculated total cost
    }

    public static void main(String[] args) {
        int pricePerChai = 20;
        int numberOfChai = 3;
        int totalCost = calculateTotalCost(pricePerChai, numberOfChai);

        System.out.println("Total cost for chai: Rs " + totalCost);
    }
}
