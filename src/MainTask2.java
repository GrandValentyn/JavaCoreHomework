import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        String string = scanner.nextLine();
        String output = isInt(string) ? isEven(Double.parseDouble(string)) ? string + " ціле і парне" :
                string + " ціле і непарне" : string + " не ціле число";
        System.out.println(output);
    }


    public static boolean isInt(String s) {
        double aDouble = new Double(s);
        int integer = (int) aDouble;
        if (Math.abs(aDouble - integer) == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEven(double number) {

        if (number % 2 == 0) {
            return true;
        }
        return false;

    }
}