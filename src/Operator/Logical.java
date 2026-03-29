package Operator;

public class Logical {
    public static void main(String[] args) {
        var hasFuel = true;
        var isWeatherGood = true;
        var hasTime = false;
        var canGoForDrive = hasFuel && isWeatherGood && hasTime;

        System.out.println("Can we go for a drive? " + canGoForDrive);
    }
}
