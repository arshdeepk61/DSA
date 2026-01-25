package arsh;

public class RemoveElement {

    //nums[3,2,2,3] val=3 output = 2(length) nums [2,2,-1,-1 ]
    //

    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=3;
//        boolean value[]= new boolean[nums.length];
//
//       for(int i=0;i<value.length;i++)
//       {
//           if(nums[i]==val)
//           {
//              value[i]=true;
//           }
//       }

       for(int i=0;i<nums.length;i++)
       {
           if (nums[i]==val)
           {
               for(int j=i;j<nums.length-1;j++)
               {
                   nums[j]=nums[j+1];
               }
               nums[nums.length-1]=-1;
           }
       }


       for(int i=0;i< nums.length;i++)
        System.out.println(nums[i]);
     int   nums2[]={3,2,2,3};
     twoPointor(nums2,val);

        System.out.println("----------------");
       for(int n:nums2)
       {
           System.out.println(n);
       }
    }

    public static int twoPointor(int[] nums, int val) {
        int i = 0; // index for elements NOT equal to val

        // Step 1: move valid elements forward
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        // Step 2: fill rest with -1
        for (int k = i; k < nums.length; k++) {
            nums[k] = -1;
        }

        return i;
    }


    //two pointors


}
