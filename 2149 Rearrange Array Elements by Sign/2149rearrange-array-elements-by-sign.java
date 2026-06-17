class Solution {
    public int[] rearrangeArray(int[] nums) {

        int positiveindex=0,negativeindex=1;
        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                arr[negativeindex]=nums[i];
                negativeindex+=2;
            }
            else{
                arr[positiveindex]=nums[i];
                positiveindex+=2;
            }
        }
        return arr;
    }
}