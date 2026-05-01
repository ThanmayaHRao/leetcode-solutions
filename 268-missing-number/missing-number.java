class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int tot = len*(len+1);
        int total = tot/2;
        int sum =0;
        for(int i=0;i<len;i++){
            sum = sum+nums[i];
        }
        return total-sum;
    }
}