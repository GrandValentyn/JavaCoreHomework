package work5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Frog extends Amphibia {
    public static void main(String[] args) {
        Consumer<Amphibia> amphibiaextends = x -> {
            x.eat();
            x.sleep();
            x.swim();
            x.walk();
        };
        Supplier<Frog> supplier = Frog::new;
        amphibiaextends.accept(supplier.get());
    }
}
