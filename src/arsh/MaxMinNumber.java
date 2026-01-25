package arsh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4,6,98));

        nums.stream().sorted().limit(3).forEach(System.out::println);

        nums.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

    }
}
