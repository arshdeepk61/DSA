package arsh;

public class RemoveDuplicatesFromSortedArray2 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int k = 2; // first two are always allowed

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,3,3,3};

        int k = removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
