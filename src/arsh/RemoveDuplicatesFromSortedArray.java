package arsh;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,1};

        int k = removeDuplicates(nums);

        // Print full array (with -1 at end)
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        // Step 1: Move unique elements to the front
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        // Step 2: Fill remaining positions with -1
        for (int k = i + 1; k < nums.length; k++) {
            nums[k] = -1;
        }

        return i + 1; // count of unique elements
    }
}
