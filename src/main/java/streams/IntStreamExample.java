package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {

    public static int getSum(int a, int b){
        return IntStream.rangeClosed(a,b).sum();
    }

    public static void main(String[] args) {
        System.out.println(getSum(1,7));
    }
}
