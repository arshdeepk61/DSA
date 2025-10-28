package sel.oops.polymorphism;

public class Child extends Parent{

    String name="Sel";

    public Child() {
        System.out.println("child");
    }

    @Override
    public void show() {
        System.out.println("child show");
    }
}
