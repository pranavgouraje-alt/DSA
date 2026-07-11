class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int cs=0,max=0;
        for(int i=0;i<k;i++)
        {
           cs+=cardPoints[i];
        }
        max=cs;

        int left=k-1,right=cardPoints.length-1;

        while(left>=0)
        {
          cs=cs-cardPoints[left];
          cs=cs+cardPoints[right];

          max=Math.max(cs,max);

          left--;
          right--;

        }
        return max;
    }
}