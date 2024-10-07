import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi73 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,7,7,4,4);
//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n->n%2==0);
//        Stream<Integer> s3 = s2.map(n->n*2);
//        int result = s3.reduce(0,(c,e) -> c+e);
//        System.out.println(result);

        int reslut = nums.stream()
                        .filter(n -> n%2==0)
                                .map(n-> n*2)
                                        .reduce(0,(c,e) -> c+e);

        System.out.println(reslut);

//      s3.forEach(n-> System.out.println(n));




//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
//        nums.forEach(con);
//        System.out.println();

//        Consumer<Integer> con = n-> System.out.println(n);
//        nums.forEach(con);
//        System.out.println();

//        nums.forEach(n -> System.out.println(n));
//        System.out.println();


//        System.out.println(nums);
//        System.out.println();

//        int sum =0;
//        for (int n : nums){
//            if(n%2==0){
//                n= n*2;
//                sum = sum + n;
//            }
//        }
//        System.out.println(sum);
//        System.out.println();

//        for (int i =0; i<=nums.size(); i++)
//        {
//            System.out.println(nums.get(i));
//        }
//        System.out.println();


//        for (int n : nums){
//            System.out.println(n);
//        }
//        System.out.println();

    }
}
