class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    public void backtrack(int start, int[] nums, int target,
                          List<Integer> curr, List<List<Integer>> result) {

        // base case
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) return;

        for (int i = start; i < nums.length; i++) {

            // choose
            curr.add(nums[i]);

            // explore (reuse same element → i)
            backtrack(i, nums, target - nums[i], curr, result);

            // unchoose
            curr.remove(curr.size() - 1);
        }
    }
}