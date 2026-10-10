class Solution {
    public int majorityElement(int[] nums) {
        int me=nums[0];
        int c=0;
        for(int num:nums)
        {
            if(c==0)
            {
                me=num;
            }
            if(num==me)
            {
                c++;
            }
            else{
                c--;
            }

        }return me;
        
    }
}