package arsh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListReverse {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(33,2,4,5,9,6,7,42);

        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
