package TypeCasting;

public class Examples {
    public static void main(String[] args) {

        // Implicit Casting
        byte a = 49;
        double b = a;

        System.out.println(a);
        System.out.println(b);

        // Implicit Casting
        int c = 98765;
        float d = c;

        System.out.println(c);
        System.out.println(d);

        // Explicit Casting
        float e = 33.5f;
        int f;
        f = (int) e;

        System.out.println(e);
        System.out.println(f);

        // Implicit Casting
        long g = 343654;
        float h;
        h = (float)g;

        System.out.println(g);
        System.out.println(h);

        // Explicit Casting
        float i = 48.283f;
        long j;
        j = (long)i;

        System.out.println(i);
        System.out.println(j);

    }
}
