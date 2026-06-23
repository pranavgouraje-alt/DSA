class Solution {
    public boolean isHappy(int n) {

        int nn=n;
        do{
        n=digitsum(n);
        nn=digitsum(digitsum(nn));
        }while(n!=nn);

        return n==1;
        
    }

    public static int digitsum(int num)
    {
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            sum+=d*d;
            num=num/10;
        }
        return sum;
    }

    
}