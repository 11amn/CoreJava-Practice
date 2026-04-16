package Method.LocalVariable;

public class SquareOfDouble {
    public static void main(String[] args) {
        double a = 7;
        double res = square(a);
        System.out.println(res);
    }

    public static double square(double a) {
        return a * a;
    }
}
