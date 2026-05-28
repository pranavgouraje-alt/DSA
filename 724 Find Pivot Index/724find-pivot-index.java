class Solution {
    public int pivotIndex(int[] nums) {
        int p = -1;
        
        for (int j = 0; j < nums.length; j++) {
           
            int leftsum = 0;
            int rightsum = 0;
      
            for (int i = 0; i < j; i++) {
                leftsum += nums[i];
            }

         
            for (int k = j + 1; k < nums.length; k++) {
                rightsum += nums[k];
            }

            if (leftsum == rightsum) {
                p = j;
                break; 
            }
        }
        
        return p;
    }
}