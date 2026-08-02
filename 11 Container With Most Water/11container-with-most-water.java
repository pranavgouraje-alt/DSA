class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxw=0 ;

        while(left<right)
        {
           int water = Math.min(height[left], height[right]) * (right - left);
            maxw=Math.max(water,maxw);
            if(height[left]<height[right])
            {
                left++;
               
            }
            else{
                 right--;
            }
        }
        return maxw;
        
    }
}