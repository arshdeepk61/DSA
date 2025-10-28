package Swetha.oops;

public class AnimalExtracter {
    public static void main(String[] args) {
        // At runtime (JVM decides which implementation to call based on the actual object)
    Animal a1=new Dog(); // This is runtime polymorphism
    a1.sound();
    a1.sleep();

    Animal a2=new Cat();
    a2.sound();
    a2.sleep();

    Cat.catSpecific();
    }
}
