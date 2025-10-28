package sel.oops.polymorphism;

//final,static and private methods cant be override
public class OverridingDemo {
    public static void main(String[] args) {
        Animal a;

        a=new Dog(); //Runtime polymorphism
        a.sound();

        a=new Cat();
        a.sound();
    }
}
