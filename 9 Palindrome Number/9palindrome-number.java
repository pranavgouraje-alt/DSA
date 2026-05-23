class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }
        int dig,rev=0;
        int temp=x;
        while(x!=0)
        {
            dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(temp==rev)
        {
            return true;
        }
        else
        {
              return false;
        }    
    }
}