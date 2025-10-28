package jia;

public class MyFirstProgram {
    public static void main(String[] args) {
/*        double s0=12.0;
        double v0=3.5;
        double a= 9.8;
        double t=10.0;

        double s= s0 + v0 * t + 0.5 * a * t * t;

        System.out.println("Position s= "+s);

        System.out.println("s0"+"vo");

        System.out.println(s0+v0);*/

/*        int c=20;
        int d= 101;

        System.out.println("Division operator: "+d / c);
        System.out.println("Modulus operator: "+d % c);*/

        int i = 2;
        int j = 11 ;
        double d = 4.1 ;
        double e = 6.0 ;

        //BODMAS
        //j/i=
        System.out.println("abc"+j/i); //5
        System.out.println(j/i *e);
        System.out.println(j/i);
        System.out.println(2 * j/i);
        //first multiplication then division
        System.out.println( "abc: "+ 2 * j / i); // 2*5*/
       System.out.println (j/i * e + 2 * j / i) ; //41.0
        System.out.println(d + i);

        //  \-> prints "
        //  \t-> tab space
        //  \\-> prints \
        //  \n-> new line
        System.out.print("\"When\tyou\t");
        System.out.print("come to \\ a fork \n");
        System.out.print("in the \t road,\n");
        System.out.print("take it.\" ");

    }
}
