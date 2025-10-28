package Swetha.arrays;

import java.util.Scanner;

public class TwoDArrayEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                sum+=matrix[i][j];
            }
        }

        System.out.println(sum);

    }
}
