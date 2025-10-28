package Swetha.oops;

public class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    public static void catSpecific()
    {
        System.out.println("Cat specific");
    }
}
