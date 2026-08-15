class Solution {
    public String minWindow(String s, String t) {

        int[]freqt=new int[128];

        for(char ch:t.toCharArray())
        {
            freqt[ch]++;
        }
        
        int req=t.length();
        int left=0,min=Integer.MAX_VALUE,start=-1;

        for(int right=0;right<s.length();right++)
        {
            char rightc=s.charAt(right);

            if(freqt[rightc]>0)
            {
                req--;
            }
            freqt[rightc]--;

            while(req==0)
            {   int currentw=(right-left)+1;
                 if(currentw<min)
                 {
                    min=currentw;
                    start=left;
                 }
                char leftc=s.charAt(left);
                freqt[leftc]++;

                if(freqt[leftc]>0)
                {
                    req++;
                }
                 left++;
            }
           
        }

        return start == -1 ? "" : s.substring(start, start+ min);
    }
}