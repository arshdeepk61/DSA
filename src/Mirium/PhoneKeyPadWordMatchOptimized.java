package Mirium;

import java.util.*;

//Instead of generating all possible words- for each word in the dictionary
//(10 words) convert it into numeric signature using the keypad mapping
//eg-"home" -> 4663
//Compare the input digits with the numeric signature
//If match -> return the word

//COMPLEXITY
// Dictionary size=k (10 here)
//word length =n (4 here)
//For each word, converting to digits takes O(n)
//Checking all words takes O(k*n)
//So--> Time complexity- O(k*n) -> 40-> very efficient
// Space complexity -> O(1) If we just check on the fly, or O(k) if we precompute digits mappings
public class PhoneKeyPadWordMatchOptimized {

    static Map<Character, Character> lettersToDigit = new HashMap<>();
    static Set<String> wordSet = new HashSet<>(
            Arrays.asList("home", "rise", "exit", "list", "nine",
                    "game", "cool", "calm", "tree", "face"));

    static {
       String[] mapping={
               "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyx"
       };
       for(int d=0;d<=9;d++)
       {
           for(char c: mapping[d].toCharArray())
           {
               lettersToDigit.put(c,(char) ('0'+d));
           }
       }
    }

    public static void main(String[] args) {
        System.out.println(findWord("4663"));
        System.out.println(findWord("2120"));
        System.out.println(findWord("5555"));
    }

    private static String findWord(String digits) {

        if(digits.contains("0") || digits.contains("1"))
        {
            return "";
        }

        for (String word: wordSet)
        {
            if(wordsToDigits(word).equals(digits))
                return word;
        }

        return "";
    }

    private static String wordsToDigits(String word) {
        StringBuilder sb=new StringBuilder();
        for(char c: word.toCharArray())
        {
            sb.append(lettersToDigit.get(c));
        }
        return  sb.toString();
    }


}
