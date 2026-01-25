package arsh;

import java.util.ArrayList;
import java.util.List;

public class MultipleOfFive {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4,5));

        nums.stream().filter(i->i%5==0).forEach(System.out::println);
    }
}
