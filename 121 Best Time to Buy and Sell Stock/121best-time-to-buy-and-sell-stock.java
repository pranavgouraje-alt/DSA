class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null)
        {
            return 0;
        }
       int minp=prices[0];
        int p=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<minp)
            {
                minp=prices[i];
            }
            else if (prices[i] - minp > p) {
                p = prices[i] - minp;
        }
        }
        return p;
        }}
    