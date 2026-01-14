class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a=0; 
        while(a<numbers.length){
            int b=a+1;
            while(b<numbers.length){
                if(numbers[a]+numbers[b] == target){
                    return new int[]{a+1,b+1};
                }
                b++;
            }
            
            a++;
        }
        return new int[]{-1,-1};
    }
}