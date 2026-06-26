class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0,tcost=0;
        for(int num:gas)
        {
            tgas+=num;
        }
         for(int num:cost)
        {
            tcost+=num;
        }

        if(tgas < tcost)
        {
            return -1;
        }

            int tank=0;
            int start=0;

            for(int i=0;i<gas.length;i++){
                tank+=gas[i]-cost[i];
                if(tank<0)
                {
                    start=i+1;
                    tank=0;
                }
            
            }
        return start;
        
    }
}