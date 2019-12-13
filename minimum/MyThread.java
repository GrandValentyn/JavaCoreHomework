package minimum;

import javax.management.InvalidAttributeValueException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyThread extends Thread {
    public MyThread() {
        super();
    }
    @Override
    public void run() {
        System.out.println("Input how much fibonachi numbers dou you want output:");
        int countOfNumbers = 0;
        Scanner scanner = new Scanner(System.in);
        try {

            countOfNumbers = scanner.nextInt();

            if (countOfNumbers <= 0) {
                throw new InvalidAttributeValueException();
            }
        } catch (InputMismatchException | InvalidAttributeValueException e) {
            System.out.println("Invalid input:");
            e.printStackTrace();
            return;
        }
        int first = 1;
        int second = 1;

        try {
            System.out.print(first + " ");
            Thread.sleep(1000);
            if (countOfNumbers > 1) {
                System.out.print(second + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 2; i < countOfNumbers; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}