package sel.oops.staticpkgs;

public class staticExample {

    static int value;

    static {
        value=100;
        System.out.println("Static executed..");
    }

    static int square(int value)
    {
        return value*value;
    }

}


