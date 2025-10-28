package Swetha.oops.assignment;

public class StringsAssignments {
    public static void main(String[] args) {
       String s = "Hello Worldo";
        String s2= "hello Worldo";
        String s4=new String();
       String s5="abcdefghijklmabcdefghijklm";
        System.out.println( s5.lastIndexOf( "def",25)); //3
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.substring(0, 5)); //Hello
        System.out.println(s.length()); //11
       // System.out.println(s.getChars(0,);
        System.out.println(s.indexOf("H")); //0
        System.out.println(s.indexOf("o")); //4
        System.out.println(s.lastIndexOf("o")); //11
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        s=s.toLowerCase();
        s2=s2.toLowerCase() ;
        System.out.println(s.equals(s2));
        System.out.println(s.charAt(9));
        s=s.replace('l','o');
      //  System.out.println(s.replace('l','o'));
        System.out.println(s);
        System.out.println(s.concat("->").concat(s2));

        String s1 = new String("Java");
        s1 = "Python";
        System.out.println(s1.toCharArray());

        char[] chars=s1.trim().toCharArray();
        for(char ch:chars)
        {
         System.out.println(ch);
        }

        //Compare to
        System.out.println(s.compareTo(s)); //0 as a==b
        System.out.println(s2.compareTo(s));

       /* String s1 = new String( "hello" );  // s1 is a copy of "hello"
                  String s2 = "goodbye";
                  String s3 = "Happy Birthday";
                  String s4 = "happy birthday";

        String output = "";
                  // test compareTo
                  output += "\ns1.compareTo( s2 ) is " + s1.compareTo( s2 ) +
                             "\ns2.compareTo( s1 ) is " + s2.compareTo( s1 ) +
                          "\ns1.compareTo( s1 ) is " + s1.compareTo( s1 ) +
                             "\ns3.compareTo( s4 ) is " + s3.compareTo( s4 ) +
                             "\ns4.compareTo( s3 ) is " + s4.compareTo( s3 ) + "\n\n";



        // test regionMatches (case sensitive)
                  if ( s3.regionMatches( 0, s4, 0, 5 ) )
                         output += "First 5 characters of s3 and s4 match\n";
                  else
                     output += "First 5 characters of s3 and s4 do not match\n";

                  // test regionMatches (ignore case)
                  if ( s3.regionMatches( true, 0, s4, 0, 5 ) )
                         output += "First 5 characters of s3 and s4 match";
                  else
                     output += "First 5 characters of s3 and s4 do not match";

        System.out.println(output);*/

     Object objectRef = "hello";

    }
}
