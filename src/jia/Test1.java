package jia;

public class Test1 {
    public static void main(String[] args) {
        int x = 5;
        //x++=5 // x=6 //++x=7 //x=7
        int y = x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);
    }

}
