package Swetha;

public class PracticeProblem1 {

    public static void main(String[] args) {
  
            int n = 4, k = 2;
            System.out.println(++n ); // n incremented to 5
            System.out.println( n ); //n still is 5
            System.out.println( n++ ); // post-increment-> print first-> then adds
            System.out.println( n ); // its 6 here
            System.out.println(-n);
            System.out.println( n );   //6
            System.out.println(--n); //5
            System.out.println( n ); //5
            System.out.println(n--); //5
            System.out.println( n );//4
            System.out.println( n + k );  //6
            System.out.println( n );//4
            System.out.println( k );  //2
            System.out.println("" + n + " " + k );  
            System.out.println( n );  
            System.out.println( " " + n );  
            System.out.println( " n" );  
            System.out.println( "\n" );  
            System.out.println( " n * n = "); //CAREFUL!
            System.out.println( n * n );  
            System.out.println( 'n' ); 
        }
}
