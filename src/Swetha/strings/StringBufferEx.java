package Swetha.strings;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer buffer1=new StringBuffer(); // capacity will be 16 by default
        StringBuffer buffer2 = new StringBuffer( 10 ); // capacity will be 10
        StringBuffer buffer3 = new StringBuffer( "hello" ); //capacity->21

        String okjk=buffer1.toString();
        String output = "buffer1 = \"" + buffer1 + "\"" +
                             "\nbuffer2 = \"" + buffer2 + "\"" +
                             "\nbuffer3 = \"" + buffer3 + "\"";

        System.out.println(buffer3.capacity());
        System.out.println(output);
    }
}
