package functional.interfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    static BiPredicate<Integer, Integer> checkIfAMultipleOfB = (a,b)-> (a % b) == 0;

    public static void main(String[] args) {
        System.out.println(checkIfAMultipleOfB.test(15,5));
    }
}
