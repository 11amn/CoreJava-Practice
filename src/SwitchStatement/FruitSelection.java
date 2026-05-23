package SwitchStatement;

public class FruitSelection {
    public static void main(String[] args) {
        int fruitCode = 2;
        switch (fruitCode) {
            case 1:
                System.out.println("Apple");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Orange");
                break;
            case 4:
                System.out.println("Mango");
                break;
            default:
                System.out.println("Unknown fruit");
                break;
        }
    }
}
