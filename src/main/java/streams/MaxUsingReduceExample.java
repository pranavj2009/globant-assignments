package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxUsingReduceExample {
    public static Optional<Integer> getMaxValue(List<Integer> integerList){
        return integerList.stream().reduce(Math::max);
    }
    public static void main(String[] args) {
        List<Integer> integerList1 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(getMaxValue(integerList1));
    }
}
