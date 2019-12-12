package work3;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args)  {
    Consumer<String> consumer = y -> System.out.println(y);
    consumer.accept("Min Float " +  Float.MIN_VALUE);
        consumer.accept("Max Float " +  Float.MAX_VALUE);
        consumer.accept("Min  Double " +  Double.MIN_VALUE);
        consumer.accept("Max Double " +  Double.MAX_VALUE);




  }
}
