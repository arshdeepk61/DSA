package arsh;

public class MoreThanN {
    public static void main(String[] args) {
            /*
        Input: nums = [3,2,3]
        Output: [3]
        Example 2:

        Input: nums = [1]
        Output: [1]
        Example 3:

        Input: nums = [1,2]
        Output: [1,2]*/

        int count1=0;
        int count2=0;
        int cand1 = 0, cand2 = 0;

        int[] nums = new int[]{  3,2,3};
       for(int num:nums)
       {
           if(num==cand1)
           {
               count1++;
                       }
           if(num==cand2)
           {
               count2++;
           }
           else if (count1 == 0) {
                  cand1=num;
               count1 = 1;

           } else if (count2 == 0) {
               cand2=num;
               count2 = 1;
           }
           else
           {
               count1--;
               count2--;
           }
       }

        count1 = 0;
        count2 = 0;

        for (int num:nums)
        {
            if(num==cand1)
                count1++;
                        if(num==cand2)
                            count2++;
        }

        if(count1> nums.length/3)
            System.out.println(cand1);
        if(count2> nums.length/3)
        System.out.println(cand2);
    }
}
