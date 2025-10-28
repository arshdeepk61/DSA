package Swetha;

import java.util.Scanner;

public class Test {
    static int x = 10 ; //class variable/instance variable
    //If one object is changing the value of an instance variable,
    // that updated value will be reflected to the other object as well

    public static void main(String[] a){
        //Object is scan here of type Scanner class
        Scanner scan=new Scanner(System.in);
        //test is the object of Test class
        Test test = new Test( ) ;  //O1
        Test test1 = new Test( ) ; //O2
        test.x += 1 ; // sum +=1 -> sum=sum+1 -> test.x += 1 -> test.x= test.x +1 -> 11
        System.out.println( test.x + test1.x ) ; //11+11
    }
}
