package minimum;

import javax.management.InvalidAttributeValueException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnableThread implements Runnable {

    public RunnableThread() {
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

        if (countOfNumbers == 1) {
            System.out.println(1);
        }

        int lastFib = lastFibonachi(countOfNumbers);
        int preLast = lastFibonachi(countOfNumbers - 1);

        try {
            System.out.print(lastFib + " ");
            Thread.sleep(1000);
            if (countOfNumbers > 1) {
                System.out.print(preLast + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 2; i < countOfNumbers; i++) {
            int next = lastFib - preLast;
            lastFib = preLast;
            preLast = next;
            System.out.print(next + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }


    public int lastFibonachi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return lastFibonachi(n - 1) + lastFibonachi(n - 2);
        }

    }
}