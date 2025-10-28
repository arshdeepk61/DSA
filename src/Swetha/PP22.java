package Swetha;

public class PP22 {
    public static void main(String[] args) {
        System.out.println(enough(9)); // will print  4  because  1+2+3+4 ≥ 9
        // but 1+2+3<9
        System.out.println(enough(21));// will print  6  because 1+2+ ...+6 ≥ 21
        // but 1+2+ . . . 5<21
        System.out.println(enough(-7));// will print  1  because  1 ≥ ‐7 and 1 is
        // the smallest positive integer
        System.out.println(enough(1)); // will print  1  because  1 ≥ 1 and 1 is
        // the smallest positive i
    }

    private static int enough(int goal)
    {
        int sum=0;
        int n=0;
        while(sum<goal)
        {
            n++;
            sum=sum+n;
        }
        return n==0 ? 1 : n ;
    }
}
