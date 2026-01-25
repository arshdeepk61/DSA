package arsh;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharInString {
    public static void main(String[] args) {
        String ab="eyguwguiweuhueiw";

        System.out.println( ab.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
//        ab.chars().forEach(System.out::println);
//        ab.chars().mapToObj(c->(char)c).forEach(System.out::println);

//         ab = "hello";
//
//        Map<Boolean, List<Character>> result =
//                ab.chars()
//                        .mapToObj(c -> (char) c)
//                        .collect(Collectors.partitioningBy(
//                                c -> "aeiou".indexOf(c) != -1
//                        ));
//
//        System.out.println(result);
    }
}
