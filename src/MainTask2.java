import java.util.Scanner;

public class MainTask2 {
    static char[] vowels = {'a', 'o', 'u', 'e', 'i'};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(replaceVowel(input));
    }

    public static String replaceVowel(String string) {


        char[] res = new String(string).toCharArray();


        for (int i = 0; i < res.length; i++) {
            for (char vowel : vowels) {
                if (res[i] == vowel) {
                    res[i] = '—';
                }
            }
        }
        return new String(res);
    }
}
