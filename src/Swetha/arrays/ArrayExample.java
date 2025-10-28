package Swetha.arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i< arr.length;i++)
        {
           arr[i]=sc.nextInt();
        }
        //Enhanced for loop
       for(int num:arr)
       {
           System.out.println(num);
       }

    }

}
