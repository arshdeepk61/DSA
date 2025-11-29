package Swetha.Assignments;

public class PP3 {
    public static void main(String[] args)
    {
        int n; //DEFAULT VALUE OF INTEGER IS 0
        System.out.println( (n = 4) ); //assignment operator
        System.out.println( (n == 4) ); //comparison operator->true/false
        System.out.println( (n > 3) );
        System.out.println( (n < 4) );
        System.out.println( (n = 0) ); //value of n updated from 4 to 0
        System.out.println( (n == 0) ); //will check whether 0 is equla to 0
        System.out.println( (n > 0) );
        System.out.println( (n == 0 && true) ); //both conditions should be true ->true
        System.out.println( (n == 0 || true) ); //any one of the condition is true -> true
        System.out.println( (!(n == 2) ));
    }
}
