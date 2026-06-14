import java.util.Arrays;

class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();

      
        for (int i = 0; i < n; i++) {
            int[] count = new int[26]; 

          
            for (int j = i; j < n; j++) {
                count[s.charAt(j) - 'a']++; 

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int c : count) {
                    if (c > 0) {
                        maxFreq = Math.max(maxFreq, c);
                        minFreq = Math.min(minFreq, c);
                    }
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }
}
