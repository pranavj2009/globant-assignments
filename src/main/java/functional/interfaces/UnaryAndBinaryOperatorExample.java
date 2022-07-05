package functional.interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorExample {
    static UnaryOperator<String> u1 = s -> s.concat("default");

    static BinaryOperator<Integer> b1 = (a,b) -> a*b;

    static Comparator<Integer> c1 = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(u1.apply("Pranav"));
        System.out.println(b1.apply(3,4));
        System.out.println(BinaryOperator.maxBy(c1).apply(3,4));
        System.out.println(BinaryOperator.minBy(c1).apply(3,4));
    }
}
