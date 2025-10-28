package jia;

public class Worksheet2 {

    public static void main(String[] args) {
        //Non primitive data type
        String str1="anna banana";

        System.out.println(str1.charAt(2));
        System.out.println(str1.substring(3,5));
        System.out.println(str1.indexOf(" b"));
        System.out.println(str1.substring(8));
        System.out.println(str1.toUpperCase());

        String str2= "st louis arch";

        System.out.println(str2.substring(8));
        System.out.println(str2.indexOf("x")); // If the character/string not available, return -1.
        System.out.println(str2.charAt(4));
        System.out.println(str2.substring(5,9));
        System.out.println(str2.indexOf("is "));

        String str3= "CaLiFoRnIa";

        System.out.println(str3.toLowerCase().indexOf(("nia")));
        System.out.println(str3.substring(4,7));
        System.out.println(str3.substring(7));

        String str4="sOMEbodY";

        System.out.println(str4.substring(8,8));
        //System.out.println(str4.length());

        //System.out.println("HelloWorld".substring(10,15));
        //search from left to right
       // System.out.println("HelloWorld".indexOf("v")); //5
      /*  //search from right to left
        System.out.println("HelloWorld".lastIndexOf("Wo")); //5


        String str5="banana";

        System.out.println(str5.lastIndexOf('a'));
        System.out.println(str5.lastIndexOf("xa"));
        System.out.println(str5.lastIndexOf("na",3)); //search backwards from index 3

        String str6="Hello";
        String str7="hello";
        System.out.println(str6.equals(str7)); //false
        System.out.println(str6.equalsIgnoreCase(str7)); //true


        String str8="     hellloo      ";
        System.out.println(str8.trim());


        // String is immutable(we cannot change strings)
        String str9="Java rocks";
        System.out.println(str9.replace("rocks","rules"));
        System.out.println(str9);
                            //java rocks      //java hi                                 //
        System.out.println(str9.toLowerCase().replace("rocks","hi").charAt(7));*/




    }
}
