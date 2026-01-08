class Solution {
    public int search(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i < nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],i));
        }
        for(int val : map.keySet()){
            if(val == target){
                return map.get(val);
            }
        }
        return -1;
    }
   
}