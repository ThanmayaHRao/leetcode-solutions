import java.util.*;

class Solution {

    public static boolean checkPrimeFrequency(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

       
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

    
        for (int count : freq.values()) {
            if (isPrime(count)) {
                return true;
            }
        }

        return false;
    }

  
    static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
