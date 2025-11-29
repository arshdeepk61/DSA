package jia.oops.assignment1;

public class DollDriver {
    public static void main(String[] args) {
        Doll doll1=new Doll(true, "Stacy");
        Doll doll2=new Doll(false, "Tammy");

        System.out.println(doll1);
        System.out.println(doll2);

        //change name using setter
        doll1.setName("Ariana");
        System.out.println(doll1);

        System.out.println(doll1.getName());
    }
}
