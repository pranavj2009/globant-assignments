package methodReference;

import java.util.function.Consumer;

public class EffectivelyFinalDemo {
    public static void main(String[] args) {
        int value = 2;
        Consumer<Integer> c1 = i -> {

            //i * value
        } ;

    }
}
