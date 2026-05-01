class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        int helper = 1;
        for (int i = 1; i < 32; i++) {
            if ((n & helper) != 0) {
                count++;
            }
            helper = helper << 1;
        }

        return count;
    }

}