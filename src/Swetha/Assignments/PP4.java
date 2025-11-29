package Swetha.Assignments;

public class PP4 {
    //Enums always have constant values
    enum colorType {red, orange, yellow, green, blue, violet};
    public static void main(String[] args)
    {
        colorType shirt, pants;
        shirt = colorType.red;
        pants = colorType.blue;
        System.out.println(" " + shirt + " " + pants );
    }
}
