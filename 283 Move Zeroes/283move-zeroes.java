class Solution {
    public void moveZeroes(int[] nums) {
        // int[] arr = new int[nums.length];
        // int insertPos = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0) {
        //         arr[insertPos] = nums[i];
        //         insertPos++;
        //     }
        // }
        
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = arr[i];
        // }

        int pos=0;
        for(int num:nums)
        {
            if(num!=0)
            {
                nums[pos]=num;
                pos++;
            }
        }
        while(pos<nums.length)
        {
            nums[pos]=0;
            pos++;
        }
        

    }
}