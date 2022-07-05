package streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfIterateGenerateExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Pranav1","Pranav2","Pranav3");
        stringStream.forEach(System.out::println);

        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        Stream.iterate(1,x->x*2).limit(10).forEach(System.out::println);

        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier).limit(5).forEach(System.out::println);
    }
}
