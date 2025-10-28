package Swetha.execptionHandling;

import java.io.IOException;

public class ThrowsEx {
    //When a method wants to pass the exception to the caller
    public static void readFile() throws IOException
    {
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            readFile();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
