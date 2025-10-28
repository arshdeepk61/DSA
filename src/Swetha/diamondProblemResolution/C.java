package Swetha.diamondProblemResolution;

public interface C extends A {
    @Override
    default void sound(){
        System.out.println("Interface C");
    }
}
