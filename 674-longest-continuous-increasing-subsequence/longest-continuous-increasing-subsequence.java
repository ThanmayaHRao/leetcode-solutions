class Solution {
    public int findLengthOfLCIS(int[] nums) {
    if(nums.length == 0)return 0;
    int maxlen = 1;
    int currlen = 1;
    for(int i=1;i<nums.length;i++){
        if(nums[i] > nums[i-1]){
            currlen++;
        }
        else{
            currlen =1;
            }
        maxlen = Math.max(currlen,maxlen);    
    }
    return maxlen;
    }
}