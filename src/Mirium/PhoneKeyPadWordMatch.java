package Mirium;

import java.util.*;

//Time complexity-7->PQRS ,9-WXYZ
//4 DIGIT INPUT, TOTAL NO OF COMBINATIONS= O(4^n) =O(256)
//For each gen word, check if exists in the dictionary
//Time complexity- O(4^n) or O(256) where n=4 (constant)
//Space complexity= O(4^n) for storing intermediate words, plus dictionary storage
public class PhoneKeyPadWordMatch {

    static Map<Character, String> keypad = new HashMap<>();
    static Set<String> wordSet = new HashSet<>(
            Arrays.asList("home", "rise", "exit", "list", "nine",
                    "game", "cool", "calm", "tree", "face"));

    static {
        keypad.put('2',"abc");
        keypad.put('3',"def");
        keypad.put('4',"ghi");
        keypad.put('5',"jkl");
        keypad.put('6',"mno");
        keypad.put('7',"pqrs");
        keypad.put('8',"tuv");
        keypad.put('9',"wxyz");
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
        List<String> results=new ArrayList<>();
        backtrack(digits,0,new StringBuilder(),results);

        for (String word: results)
        {
            if(wordSet.contains(word))
                return word;
        }

        return "";
    }

    private static void backtrack(String digits,int index,
                                  StringBuilder path,List<String> results){

        if(index==digits.length())
        {
        results.add(path.toString());
        return;
        }
        //4 6 6 3
        String letters=keypad.get(digits.charAt(index)); //ghi
        for(char c: letters.toCharArray())  //-->"ghi"--> 'g','h','i'
        {
            path.append(c); // path= "g"
            backtrack(digits,index+1,path,results);
            path.deleteCharAt(path.length()-1);
        }

    }

}
