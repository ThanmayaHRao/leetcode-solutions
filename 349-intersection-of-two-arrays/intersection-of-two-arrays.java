class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;

        for(int i=0;i<n1;i++){
            set.add(nums1[i]);
        }

        for(int i =0;i<n2;i++){
            if(set.contains(nums2[i])){
                set1.add(nums2[i]);
                set.remove(nums2[i]);
            }
            
        }

        int [] result = new int[set1.size()];
        int index = 0;

        for(int num : set1){
            result[index++] = num;
        }
            


    return result;
    }
}