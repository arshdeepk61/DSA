package arsh;

import java.util.Arrays;

public class AverageOfAllnumbersArray {
    public static void main(String[] args) {
        int[] nums = {33,2,4,5,9,6,7,42};
        Arrays.stream(nums).average().getAsDouble();
    }
}
