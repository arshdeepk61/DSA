package Swetha;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading m1=new MethodOverloading();
        m1.add(1,2);
        m1.add(1,2,3);

    }

    public void test1()
    {
        System.out.println("Testing...");
    }

    public void test1(int a)
    {
        System.out.println("Testing...");
    }

    public void test1(float a)
    {
        System.out.println("Testing...");
    }

    public void test1(String d,float a)
    {
        System.out.println("Testing...");
    }

    public void test1(float a,String d)
    {
        System.out.println("Testing...");
    }


    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }


}
