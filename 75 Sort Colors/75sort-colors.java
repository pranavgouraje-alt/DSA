class Solution {
    public void sortColors(int[] nums) {

     int low=0,high=nums.length-1,mid=0;

    while(mid<=high)
    {
        if(nums[mid]==0)
        {
            int temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;

            low++;
            mid++;
        }

        else if(nums[mid]==1)
        {
            mid++;
        }

        else if(nums[mid]==2)
        {
            int temp=nums[high];
            nums[high]=nums[mid];
            nums[mid]=temp;
            high--;
        }
    }
     for(int k=0;k<=nums.length-1;k++)
       {
        System.out.println(nums[k]);
       }
    }
}
