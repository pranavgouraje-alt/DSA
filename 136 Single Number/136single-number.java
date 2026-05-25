class Solution {
    public int singleNumber(int[] nums) {
        int sn = 0;
        
        for (int num : nums) {
            sn ^= num;
        }
        
        return sn;
    }
}