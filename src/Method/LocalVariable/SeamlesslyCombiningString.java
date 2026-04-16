package Method.LocalVariable;

public class SeamlesslyCombiningString {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        String res = concatenate(str1, str2);
        System.out.println(res);
    }

    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }
}
