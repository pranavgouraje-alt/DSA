class Solution {
    public int trap(int[] height) {
         int total=0;
        int sufix[]=new int[height.length];
        int prefix[]=new int[height.length];
        int rmax=height[height.length-1];
        for(int i=height.length-1;i>=0;i--)
        {   rmax=Math.max(rmax,height[i]);
            sufix[i]=rmax;
        }
        int lmax=height[0];
         for(int i=0;i<height.length;i++)
        {   lmax=Math.max(lmax,height[i]);
            prefix[i]=lmax;;
        }
         
         for(int i=1;i<height.length-1;i++)
         {
          
                total+=Math.min(sufix[i],prefix[i])-height[i];
            
         }

         return total;
    }
}