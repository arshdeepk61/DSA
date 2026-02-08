package arsh;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
      int[] result =two(nums,target);

      for(int i :result)
      {
          System.out.println(i);
      }


    }


    static int[] two(int[] nums, int target) {
        HashMap<Integer, Integer> numsWithValue = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numsWithValue.containsKey(complement)) {
                return new int[]{numsWithValue.get(complement), i};
            }
            numsWithValue.put(nums[i],i);


        }
        return new int[]{};
    }

}
