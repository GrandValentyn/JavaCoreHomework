import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {

        String str1 = "Пилип";
        String str2 = "ротор";
        String str3 = "КоМоК";
        String str4 = "JavaCore";
        System.out.println(String.format("%s is polindrom %s",str1,isPolindrom(str1)));
        System.out.println(String.format("%s is polindrom %s",str2,isPolindrom(str2)));
        System.out.println(String.format("%s is polindrom %s",str3,isPolindrom(str3)));
        System.out.println(String.format("%s is polindrom %s",str4,isPolindrom(str4)));
    }
    public static boolean isPolindrom(String string0){
        String string = string0.toLowerCase();
        if(string.length() != 5){
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < string.length();i++){
            if(string.charAt(i) != string.charAt(string.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
