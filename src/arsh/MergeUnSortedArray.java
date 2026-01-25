package arsh;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeUnSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 7};
        int[] arr2 = {8, 3, 6, 4, 10};

        System.out.println(
                Arrays.toString(
                        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                                .sorted()
                                .toArray()
                )
        );
    }
}
