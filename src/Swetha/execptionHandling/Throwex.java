package Swetha.execptionHandling;

public class Throwex {

    public static void checkAge(int age)
    {
    if(age<18)
    {
        throw new ArithmeticException("Not eligible to vote");
    }
    else{
        System.out.println("Eligible to vote!");
    }
    }

    public static void main(String[] args) {
        try {
            checkAge(4);
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
