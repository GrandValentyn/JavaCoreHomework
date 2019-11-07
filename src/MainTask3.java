import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number1:");
        String string = scanner.nextLine();

        System.out.println("Input number2:");
        String string1 = scanner.nextLine();

        String output = isInt(string) && isInt(string1) ? String.format("%s + %s = %s", string, string1, sum(string, string1))
                : "Invalid input";
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

    public static int sum(String s, String s1) {
        double a = new Double(s);
        double a1 = new Double(s1);
        double res = a + a1;
        return (int) res;
    }
}
