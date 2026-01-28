class Solution {
    public boolean isMonotonic(int[] nums) {
        int left = 1;

        // check increasing
        while (left < nums.length) {
            if (nums[left] >= nums[left - 1]) {
                left++;
            } else {
                break;
            }
        }
        if (left == nums.length) return true;

        // check decreasing
        left = 1;
        while (left < nums.length) {
            if (nums[left] <= nums[left - 1]) {
                left++;
            } else {
                return false;
            }
        }
        return true;
    }
}
