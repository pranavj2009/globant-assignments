package methodReference;

import java.util.function.Function;

public class FunctionMethodReference {
    static Function<String, String> f1 = s -> s.toUpperCase();
    static Function<String, String> f2 = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(f1.apply("Pranav"));
        System.out.println(f2.apply("Pranav"));
    }
}
