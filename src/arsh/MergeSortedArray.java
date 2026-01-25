package arsh;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

         int nums1[]= {1,2,3,0,0,0};
         int m=3;

         int nums2[]={2,5,6};
         int n=3;

         //output {1,2,2,3,5,6}

        mergeArray(nums1, m, nums2, n);

        for(int i=0;i<nums1.length;i++)
        System.out.println(nums1[i]);

    }

    static void mergeArray(int[] nums1, int m , int[] nums2, int n)
    {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(j>=0)
        {
            if(i>=0&&nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
            }
            else
            {
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }

//        for (int k=m+n-1;k>=i;k--)
//        {
//            if(nums2[j]>nums1[i])
//            {
//                nums1[k]=nums2[j];
//                j--;
//            }
//            else {
//                nums1[k]=nums1[i];
//                i--;
//            }
//
//
//        }

//        while(j>=0)
//        {
//            if(i>=0 && nums1[i]>nums2[j])
//            {
//                nums1[k]=nums1[i];
//                i--;
//
//            }
//            else {
//                nums1[k]=nums2[j];
//                j--;
//            }
//            k--;
//        }
    }
}
