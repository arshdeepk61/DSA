package Swetha;

public class PP2 {
    public static void main(String[] args) {
        //float/double->stores decimals
        //char ->characters
        int n = 3;
        while (n >= 0) {
            System.out.println(n * n);
            --n;
        }
        System.out.println(n);
        while (n < 4)
            System.out.println(++n);
        System.out.println(n);
        while (n >= 0)
            System.out.println((n /= 2)); //n=n/2 --> 4/2=2 --> n=2
    }
}

