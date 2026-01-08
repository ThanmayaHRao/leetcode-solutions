class Solution {
    public int findMin(int[] nums) {
           int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than last element,
            // minimum must be on the right side
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
            // Otherwise, minimum is on the left side (including mid)
            else {
                high = mid;
            }
        }
        return nums[low];
    }
}