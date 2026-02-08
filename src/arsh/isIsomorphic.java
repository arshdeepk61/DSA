package arsh;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class isIsomorphic {

    public static void main(String[] args) {
        String s = "egg", t = "add";

        if (s.length() != t.length()) {
            System.out.println(" Length are not equal");
        }
        HashMap<Character, Integer> first = new HashMap<>();
        HashMap<Character, Integer> second = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);


            if (first.getOrDefault(c1, i) != second.getOrDefault(c2, i)) {
                System.out.println(false);
                break;
            }
            first.put(c1, i);
            second.put(c2, i);
        }


    }
}
