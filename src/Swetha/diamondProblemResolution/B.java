package Swetha.diamondProblemResolution;

public interface B extends A {
    @Override
    default void sound(){
        System.out.println("Interface B");
    }
}
