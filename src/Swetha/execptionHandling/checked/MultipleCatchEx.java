package Swetha.execptionHandling.checked;

public class MultipleCatchEx {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50;
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Math error!");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array index error!");
        }
        catch (Exception ex){
            System.out.println("Some other exception");
        }
    }
}
