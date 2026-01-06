class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> minHeap =  new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int val : map.keySet()){
            minHeap.add(val);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int [] out = new int[k];
        int i = 0;
        while(!minHeap.isEmpty()){
            out[i++] = minHeap.poll();
        }


        return out;
       }
     
    }
