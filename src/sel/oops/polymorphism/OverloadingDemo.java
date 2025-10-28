package sel.oops.polymorphism;

public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(2,3   ));
        System.out.println(calculator.add(2.5,3.5));
        System.out.println(calculator.add(1,2,3));
    }
}
