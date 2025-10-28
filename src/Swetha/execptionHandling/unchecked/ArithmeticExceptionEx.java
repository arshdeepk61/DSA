package Swetha.execptionHandling.unchecked;

import java.util.Scanner;

public class ArithmeticExceptionEx {
    //Arithmetic EXCEPTION WHEN WE TRY TO DIVIDE BY 0
    public static void main(String[] args) {

        int num=100;
        Scanner scanner=new Scanner(System.in);
        int div=0;
        try{
             div=num/12;
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Exception occured: "+ex.getMessage());
        }
        finally {
            System.out.println("Finally always executes");
            scanner.close();
        }

    }
}
