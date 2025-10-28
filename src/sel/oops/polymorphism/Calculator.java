package sel.oops.polymorphism;


//Polymorphism- many forms
//Java allows the same method to behave differently depending on the context

//Compile time -> method overloading-> Decided by the compiler at compile time
public class Calculator {
    public int add(int a,int b)
    {
        return a+b;
    }

    public double add(double a, double b)
    {
        return a+b;
    }

    public int add(int a,int b,int c)
    {
        return a+b+c;
    }

}
