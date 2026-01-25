package arsh;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqEachChar {
    public static void main(String[] args) {
        String ab= "abcdefghisdfadds";
        System.out.println( ab.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
    }
}
