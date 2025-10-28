package Swetha.diamondProblemResolution;

public class D implements B,C{

    @Override
    public void sound()
    {
    B.super.sound(); // You can choose which parent's method to call explicitly
        C.super.sound();
        System.out.println("Class D");
    }

    public static void main(String[] args) {
        D obj=new D();
        obj.sound();
    }
}
