public class Solution2 {
    public static int removeElement(int[] nums, int val) {
        int h = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[h++] = nums[i];
            }
        }
        return h;
    }
}