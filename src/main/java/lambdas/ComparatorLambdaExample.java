package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /**
         * Prior java
         * */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(02);
            }
        };

        System.out.println("Result1 = "+comparator.compare(1,2));

        /**
         *  Java 8 way
         * */

        Comparator<Integer> comparator2 = (a, b) ->  a.compareTo(b);
        System.out.println("Result2 = "+comparator2.compare(3,4));


        Comparator<Integer> comparator3 = (a, b) -> 5;
        System.out.println("Result3(Nonsens) = "+comparator3.compare(3,4));
    }
}
