class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result = new ArrayList<>();

        if( strs == null || strs.length == 0) return result;
        HashMap<String,ArrayList<String>> hm = new HashMap<>();

        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            ArrayList<String> list = hm.getOrDefault(sorted,new ArrayList<>());

            list.add(str);

            hm.put(sorted,list);

        }
        for(Map.Entry<String,ArrayList<String>> entry : hm.entrySet()){
            ArrayList<String> value = entry.getValue();
            result.add(value);
        }

    return result;
    }
}