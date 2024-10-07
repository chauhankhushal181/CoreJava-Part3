import java.util.*;

public class Set70 {
    public static void main(String[] args) {
//        Set<Integer> nums =  new HashSet<Integer>();
//        nums.add(63);
//        nums.add(72);
//        nums.add(83);
//        nums.add(93);
////      nums.add("5");
//
//        for (int n : nums) {
//            System.out.println(n);
//        }

//        Set<Integer> nums =  new TreeSet<Integer>();
//        nums.add(63);
//        nums.add(72);
//        nums.add(83);
//        nums.add(93);
////      nums.add("5"); //in a sorted order
//
//
//        for (int n : nums) {
//            System.out.println(n);
//        }
//    }
//}

        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(34);
        nums.add(14);
        nums.add(44);
        nums.add(54);
        nums.add(24);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
            System.out.println(values.next());

    }
}
