class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

       /* int ans=1;
        for(int i=1;i<=x;i++)
        {
            if(i*i<=x)
            {
                ans=i;;
            }
            else{
                break;
           } }*/

        int low = 1, high = x;
        int ans = 1;

        while (low <= high) {
          
            int mid = low + (high - low) / 2; 

         
            if (mid == x / mid) {
                return mid; 
            } 
            else if (mid < x / mid) {
                ans = mid;    
                low = mid + 1;
            } 
            else {
                high = mid - 1; 
            }
        }
        
        return ans;
    }
}