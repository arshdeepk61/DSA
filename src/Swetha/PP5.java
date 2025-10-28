package Swetha;

import java.util.Scanner;

public class PP5 {
    public static void main(String[] args) {
        //PP5
        /*int i = 5, j = 6, k = 7, n = 3;
        //j *k = 6* 7=  42
        //k % n = 7 % 3 = 1 (remainder)
        //5 + 42 - 1 =46
        System.out.println( i + j * k - k % n ); //46
        System.out.println( i / n ); // 5/3= 1*/

        //PP6
       /* int found = 0, count = 5;
        //FOUND= 0 BUT IN JAVA IF(! FOUND) IS INVALID BECAUSE ! works on booleans
        if (!found || --count == 0)
        System.out.println( "danger" );
        System.out.println( "count = " + count );*/

        //PP6
/*        char [] title = {'T', 'i', 't', 'a', 'n', 'i', 'c'};
        char ch = title[1]; // i ->  assignment happens from RHS -> LHS
        title[3] = ch; // {'T', 'i', 't', 'i', 'n', 'i', 'c'};
        System.out.println( title ); // Titinic
        System.out.println( ch ); //i*/

        //PP7
        Scanner scan=new Scanner(System.in); // To get the input from the user
        String message;
        System.out.println("Enter a sentence on the line below." );
        //next()-> when you want to get string from user, but it will show you the very first word
        //nextLine()-> when you want to show the entire string given by the user
        //nextInt()->when you want to get integer from a user
        //nextBoolean() -> when it is boolean
        message = scan.nextLine(); // Get the input from the user and store it in message
        System.out.println( message );
    }
}
