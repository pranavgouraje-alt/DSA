class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       Set<List<Integer>>ans=new HashSet<>();

       for(int i=0;i<nums.length;i++)
       {
         Set<Integer>seen=new HashSet<>();
         for(int j=i+1;j<nums.length;j++)
         {
            int req=0-(nums[i]+nums[j]);

            if(seen.contains(req))
            {
                List<Integer>temp=Arrays.asList(nums[i], nums[j], req);
                    Collections.sort(temp); 
                    ans.add(temp);
            }
            seen.add(nums[j]);
          }

          
        }
        return new ArrayList<>(ans);
    }
}