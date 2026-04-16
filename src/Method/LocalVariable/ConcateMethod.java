package Method.LocalVariable;

public class ConcateMethod {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        printConcate(str1, str2);
    }

    public static void printConcate(String str1, String str2) {
        System.out.println(str1 + str2);
    }
}
