package imperativevsdeclarative;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example1 {


    public static void main(String[] args) {
        example2();
    }

    public static void example1(){
        /*
         *       Declarative way of summing ints
         * */
        int sum = IntStream.rangeClosed(0,100).sum();
        System.out.println(sum);

    }

    public static void example2(){
        /*
         *       Declarative way of getting unique ints
         * */
        List<Integer> integerList = Arrays.asList(1,2,3,3,4,4,5,6,7,7);
        List<Integer> uniqueIntegerList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueIntegerList);

    }

}
