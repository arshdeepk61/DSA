package Swetha;

public class DQ1 {
    public static void main(String[] args) {
        byte b;
        int i = 258;
        double d = 325.59;
        b = (byte) i;
        System.out.println(b); // 258 % 256 -> 2
        i = (int) d; // truncates decimal-> 325
        System.out.println(i);
        b = (byte) d; // // 325 % 256 -> 69
        System.out.println(b);
    }
}
