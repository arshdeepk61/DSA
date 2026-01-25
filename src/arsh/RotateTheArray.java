package arsh;

public class RotateTheArray {

    public static void main(String[] args) {
        //Input: nums = [1,2,3,4,5,6,7], k = 3
        //Output: [5,6,7,1,2,3,4]
        //Explanation:
        //rotate 1 steps to the right: [7,1,2,3,4,5,6]
        //rotate 2 steps to the right: [6,7,1,2,3,4,5]
        //rotate 3 steps to the right: [5,6,7,1,2,3,4]


        int[] rotate = new int[]{ 1,2,3,4,5,6,7};
        int k=3;
       for (int i=0; i<k;i++)
       {
           int pop=rotate[rotate.length-1];
           for(int j=rotate.length-1;j>0;j--)
           {
               rotate[j]=rotate[j-1];
           }
           rotate[0]=pop;
       }
       for(int nums:rotate)
       {
           System.out.println(nums);
       }
    }
}
