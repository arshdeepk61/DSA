package Swetha;

public class PP21 {
    //public/private/protected
    public static void main(String[] args) {
        System.out.println(sumFromTo(4,7)); // prints 22 because 4+5+6+7 = 22
        System.out.println(sumFromTo(-3,1)); // prints ‐5 because
// ‐3+(‐2)+(‐1)+0+1 = ‐5
        System.out.println(sumFromTo(7,4)); // prints 22 because 7+6+5+4 = 22
        System.out.println(sumFromTo(9,9)); // prints 9
    }

    private static int sumFromTo(int first, int last)
    {
        int sum=0;
        if(first<last)
        {
            for(int i=first;i<=last;i++)
            {
                sum=sum+i;
            }
        }
        else {
            for(int i=first;i>=last;i--)
            {
                sum=sum+i;
            }
        }

       return sum;
    }


}
