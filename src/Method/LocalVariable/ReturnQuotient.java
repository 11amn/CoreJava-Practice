package Method.LocalVariable;

public class ReturnQuotient {
    public static void main(String[] args) {
        float a = 9.0f;
        float b = 3.0f;
        float res = quotient(a, b);
        System.out.println(res);
    }

    public static float quotient(float a, float b) {
        return a / b;
    }
}
