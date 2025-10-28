package Swetha.interfaces;

public class Usage implements MyInterface{

    public static void main(String[] args) {
        Usage u=new Usage();
        u.show();
        u.display();

        Usage u1=new Usage();
        u1.show();
        u1.display();
        System.out.println(Usage.MAX_VALUE);
    }

    @Override
    public void display() {
        System.out.println("dipsplay called");
    }
}
