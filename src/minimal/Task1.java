package minimal;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {


        Integer integers [] = new Integer[16];
        integers [0] = (int)(Math.random()*15);;
        integers [1] = (int)(Math.random()*15);
        integers [1] = (int)(Math.random()*15);
        integers [2] = (int)(Math.random()*15);
        integers [3] = (int)(Math.random()*15);
        integers [4] = (int)(Math.random()*15);
        integers [5] = (int)(Math.random()*15);
        integers [6] = (int)(Math.random()*15);
        integers [7] = (int)(Math.random()*15);
        integers [8] = (int)(Math.random()*15);
        integers [9] = (int)(Math.random()*15);
        integers [10] = (int)(Math.random()*15);
        integers [11] = (int)(Math.random()*15);
        integers [12] = (int)(Math.random()*15);
        integers [13] = (int)(Math.random()*15);
        integers [14] = (int)(Math.random()*15);
        integers [15] = (int)(Math.random()*15);

        Arrays.sort(integers);

        System.out.println("Completely Sorted: " + Arrays.toString(integers));

    }
}
