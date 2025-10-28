package Swetha.execptionHandling.checked;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionEx {
    public static void main(String[] args) {
        try{
            FileReader fileReader=new FileReader("data.txt");
        }
        catch (IOException ex)
        {
            System.out.println("Exception occurred: "+ex.getMessage());
        }

    }
}
