package arsh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SepOddEvenNum {
    public static void main(String[] args) {
//        int[] nums = {33,2,4,5,9,6,7,42};
//        Arrays.stream(nums).count();
//
//        System.out.println( Arrays.stream(nums).sum());

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
     //   System.out.println( nums.stream().collect(Collectors.partitioningBy(a->a%2==0)));

        System.out.println(nums.stream().collect(Collectors.groupingBy(a->a%2==0)));
      //  System.out.println(nums);
 }
}
