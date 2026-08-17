class Solution {
    public int rob(int[] nums) {

        int n=nums.length;

        if(n==1){
            return nums[0];
        }

        int case1=func(nums,0,n-2);
        int case2=func(nums,1,n-1);

        int res=Math.max(case1,case2);

        return res;
        
    }

    public static int func(int nums[],int start,int end){

        int pre1=0, pre2=0;

        for(int i=start;i<=end;i++){
            int curr=Math.max(pre1,nums[i]+pre2);

            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;
    }

}