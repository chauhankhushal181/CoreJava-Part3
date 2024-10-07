import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;
//import java.util.function.Predicate;
import java.util.stream.Stream;

public class ReduceFilterSorted74 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,7,7,4,4);

        Stream<Integer> sortedValues = nums.parallelStream()
                .filter(n -> n%2==0)
                        .sorted();

        sortedValues.forEach(n -> System.out.println(n));
    }
}

