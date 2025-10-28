package jia;

public class StringMethods {
    public static void main(String[] args) {
        //Method 1 of creating strings
        String s="Hello";   //Stack memory s is stored and whioch point to String contant pool
        String s4="Hello";
        System.out.println(s==s.concat(s4));

        System.out.println(s==s4);
        System.out.println(s.length());
        char character=s.charAt(1);
        System.out.println(character);

        //How to create strings - Method 2
        String s1=new String("Java"); // Stores in heap memory - #1221
        String s2=new String("Java"); // Stores in heap memory- #12245
        System.out.println(s1==s2); //false -- this compares teh address of the strings
        System.out.println(s1.equals(s2));  //true- why because this compares the content of the strinbg

        String apple="Apple"; // A comes before B
        String banana="Banana";
        //O-> if both strings are equal
        //<0-> if the first string is smaller than second
        //>0 -> if first string is graeter than second
        System.out.println(apple.compareTo(banana));
        System.out.println(banana.compareTo(apple));


        String s9="Cat";
        String s10="Caterpillar";
        System.out.println(s9.compareTo(s10));

        String s11="bat"; // t -> 116
        String s12="ball"; // l->108
        System.out.println(s11.compareTo(s12));


        //SUBSTRING
        String s13="Programming";
        System.out.println(s13.substring(3));
        System.out.println(s13.substring(0,6));

        //INDEXIOF AND LASTINDEXOF
        String s14="abracadbra";
        System.out.println(s14.indexOf('a'));
        System.out.println(s14.lastIndexOf('a'));

        //CONCAT
        String hello="Hello";
        String world="World";
        String result= hello.concat("->").concat(world).concat(".");
        System.out.println(result);


        //== functionality
        String old="I like Java";
        String newString= new String("Jia");
        System.out.println(old==newString);
        System.out.println(old.equals(newString));
        System.out.println(old.concat(newString));
        System.out.println(old.trim());
        System.out.println(old.charAt(4));
        System.out.println(old.length());
        System.out.println(old.indexOf('a'));
        System.out.println(old.lastIndexOf('a'));
        System.out.println(old.indexOf("like"));
        System.out.println(old.substring(7));
        System.out.println(old.substring(7,9));
        System.out.println(old.indexOf('i'));
        System.out.println(newString.compareTo(old)); //0/-ve/+ve
    }
}
