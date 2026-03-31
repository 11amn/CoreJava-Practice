package Operator;

public class Unary {
    public static void main(String[] args) {

        // Pre Increment
        var a = 10;
        var b = ++a + ++a;
        System.out.print(a + ",");
        System.out.print(b);
        System.out.println();

        // Post Increment
        var c = 10;
        var d = ++c + ++c;
        System.out.print(c + ",");
        System.out.print(d);
        System.out.println();

        // Pre Decrement
        var e = 10;
        var f = ++e + ++e;
        System.out.print(e + ",");
        System.out.print(f);
        System.out.println();

        // Post Decrement
        var g = 10;
        var h = ++g + ++g;
        System.out.print(g + ",");
        System.out.print(h);
        System.out.println();
    }
}
