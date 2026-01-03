class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

      //To find frequency  
        for(int i =0; i <n ;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
            }
     //To find mejority
        for(int key : map.keySet()){
            if(map.get(key) > n/2){
                return key;
            }
        }
    return -1;    
    }
}