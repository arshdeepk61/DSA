package Swetha.strings;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String str="Java   " +
                " is" +
                "  fun " +
                "to  " +
                "learn";

        StringTokenizer st=new StringTokenizer(str);

        String str2="X=10;Y=20;Z=30";
        StringTokenizer st2=new StringTokenizer(str2,"=;",true);




        while(st2.hasMoreElements())
            System.out.println(st2.nextElement());
    }
}
