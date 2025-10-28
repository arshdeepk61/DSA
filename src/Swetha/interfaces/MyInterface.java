package Swetha.interfaces;

public interface MyInterface {
    //Constants are always in capital letters
    int MAX_VALUE= 100;

    void display();

    default void show()
    {
        System.out.println("Default implementation");
    }
}
