class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int [] count = new int[26];
        for(char c : s1.toCharArray()){
            count[c - 'a']++;
        }

        int left =0;int right=0;
        int needed = s1.length();
        while(right<s2.length()){
            char rchar = s2.charAt(right);
            if(count[rchar - 'a']>0){
                needed--;
            }
            count[rchar-'a']--;
            right++;

            if(needed == 0)return true;

            if(right - left == s1.length()){
                char lchar = s2.charAt(left);
                if(count[lchar-'a']>=0){
                    needed++;
                }
                count[lchar-'a']++;
                left++;
            }
        }
        return false;
    }
}