package sel.oops.defaultMethods;

public interface MyInterface {
    void abstractMethod();

    default void defaultMethod()
    {
        System.out.println("This is default");
    }
}
