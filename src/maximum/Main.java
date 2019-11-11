package maximum;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car [] [] array = new Car[(int) (Math.random()*3 + 1)][(int) (Math.random()*3 + 1)];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = new Car();

            }

        }

        System.out.println(Arrays.deepToString(array));

    }

}
