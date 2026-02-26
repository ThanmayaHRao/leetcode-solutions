class Solution {
    public String toLowerCase(String s) {

        char[] arr = s.toCharArray();
        char[] res = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                res[i] = (char)(arr[i] + 32);
            } else {
                res[i] = arr[i];
            }
        }

        return new String(res);
    }
}