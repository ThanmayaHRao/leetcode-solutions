class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            map.putIfAbsent(nums[i], new ArrayList<>());
            List<Integer> list = map.get(nums[i]);

            if (!list.isEmpty()) {
                int lastIndex = list.get(list.size() - 1);
                if (Math.abs(i - lastIndex) <= k) {
                    return true;
                }
            }

            list.add(i);
        }

        return false;
    }
}
