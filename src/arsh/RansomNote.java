package arsh;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        // leet code 383
//        Example 1:
//        Input: ransomNote = "a", magazine = "b"
//        Output: false
//        Example 2:
//        Input: ransomNote = "aa", magazine = "ab"
//        Output: false

        String ransomNote = "aa";
        String magazine = "aab";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: magazine.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }


        for(char c: ransomNote.toCharArray())
        {
            if(!map.containsKey(c)|| map.get(c)<1)
            {
                System.out.println(" Not");
                break;
            }
            map.put(c, map.get(c) - 1);

        }
        System.out.println(" true");
    }
}
