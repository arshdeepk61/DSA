package Swetha;

import java.util.Scanner;

public class pp11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a non‐negative integer: ");
            n = scan.nextInt();

            if(n<0)
                System.out.println("The integer you entered is negative.");

        }while (n<0);

    }
}
