package comlgslabinterface2;

import comlgslabinterface1.Devide;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int x = 12, y = 10;


        System.out.println(String.format(" %s / %s = %s", x, y, myCalculator.devide(x, y)));
        System.out.println(String.format(" %s * %s = %s", x, y, myCalculator.multiply(x, y)));
        System.out.println(String.format(" %s + %s = %s", x, y, myCalculator.plus(x, y)));
        System.out.println(String.format(" %s - %s = %s", x, y, myCalculator.minus(x, y)));


    }
}
