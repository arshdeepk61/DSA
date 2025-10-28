package Swetha.diamondProblemResolution;

public interface A {
    //No abstract keyword, but it is an abstract method
    default void sound(){
        System.out.println("Interface A");
    }
}
